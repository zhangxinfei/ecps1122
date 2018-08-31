package cn.itcast.util;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by wxl on 2018/1/8.
 */
public class UploadUtils {
    /**
     * poi文件上传
     * @param Mfile
     * @param request
     * @param docName
     * @return
     */
    public static String uploadData(MultipartFile Mfile, HttpServletRequest request, String docName, String suffix){
        //获取项目的根路径
        String classPath = request.getSession().getServletContext().getRealPath("/");
        //把spring文件上传的MultipartFile转换成CommonsMultipartFile类型
        CommonsMultipartFile cf= (CommonsMultipartFile)Mfile;
        //获取本地存储路径
        File file = new File(classPath+"\\fileupload");
        //创建一个目录,如果路径不存在 （它的路径名由当前 File 对象指定，包括任一必须的父路径。）
        if(!file.exists()){file.mkdirs();}
        //新建一个文件
        String pathFile = classPath+"\\fileupload\\" + docName + suffix;
        File file1 = new File(pathFile);
        //将上传的文件写入新建的文件中
        try {
            cf.getFileItem().write(file1);
        } catch (Exception e) {
            pathFile="";
            e.printStackTrace();
        }
        return pathFile;
    }
}
