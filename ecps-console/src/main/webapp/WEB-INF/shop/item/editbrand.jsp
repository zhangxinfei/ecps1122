<%@ include file="/ecps/console/common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<head>
<title>修改品牌_品牌管理_商品管理</title>
<meta name="heading" content="品牌管理"/>
<meta name="tag" content="tagName"/>
<script type="text/javascript" src="<c:url value='/${system}/res/js/jquery.form.js'/>"></script>
<script type="text/javascript">
$(function(){
	/*
		表单提交之前校验
		$("#form111").submit(function(){
			return false;//阻止表单提交
			return true;//允许表单提交
			
		})
	 */
	$("#form111").submit(function(){
		var flag = true;
		//$(this)表单
		$(this).find("[reg2]").each(function(){
			var inputObj = $(this);//$(this)遍历的每一个input
			var val = inputObj.val();//输入的值
			var regStr = inputObj.attr("reg2");//正则表达式的字符串
			var reg = new RegExp(regStr);//获得正则的对象
			var tip = inputObj.attr("tip");//获得提示信息
			if(!reg.test(val)){
				inputObj.next("span").html(tip);
				flag = false;
				return false;//跳出each
			}else{
				var inputName = inputObj.attr("name");
				inputObj.next("span").html("");
				
			}
		})
		
		
		
		$(this).find("[reg1]").each(function(){
			var inputObj = $(this);//$(this)遍历的每一个input
			var val = inputObj.val();//输入的值
			var regStr = inputObj.attr("reg1");//正则表达式的字符串
			var reg = new RegExp(regStr);//获得正则的对象
			var tip = inputObj.attr("tip");//获得提示信息
			
			if(val != ""&& val != null && !reg.test(val)){
				inputObj.next("span").html(tip);
				flag = false;
				return false;//跳出each
			}else{
				inputObj.next("span").html("");
			}
		});
		
		
		if(flag == true){
			tipShow("refundLoadDiv");
		}
		return flag;
	});
	
	
	//必填字段的离开焦点的校验
	$(this).find("[reg2]").blur(function(){
		var inputObj = $(this);//当前所离开焦点的input
		var val = inputObj.val();//输入的值
		var regStr = inputObj.attr("reg2");//正则表达式的字符串
		var reg = new RegExp(regStr);//获得正则的对象
		var tip = inputObj.attr("tip");//获得提示信息
		if(!reg.test(val)){
			inputObj.next("span").html(tip);
		}else{
				inputObj.next("span").html("");
			
		}
	});
	
	$(this).find("[reg1]").blur(function(){
		var inputObj = $(this);//$(this)遍历的每一个input
		var val = inputObj.val();//输入的值
		var regStr = inputObj.attr("reg1");//正则表达式的字符串
		var reg = new RegExp(regStr);//获得正则的对象
		var tip = inputObj.attr("tip");//获得提示信息
		
		if(val != ""&& val != null && !reg.test(val)){
			inputObj.next("span").html(tip);
		}else{
			inputObj.next("span").html("");
		}
	});
	
	
	
});




function submitUpload(){
	var option = {
			url:"${path}/upload/upload.do",//使用ajax的方式提交表单，url以option中为准
			type:'post',
			dataType:"text",//不要写成dateType
			data:{
				fileName:'imgsFile'
			},
			success:function(responseText){
				//把字符串解析成json对象
				var obj = $.parseJSON(responseText);
				$("#imgsImgSrc").attr("src", obj.realPath);
				$("#imgs").val(obj.relativePath);
				
			},
			error:function(){
				alert("系统错误");
			}
	};
	
	$("#form111").ajaxSubmit(option);
}
</script>
</head>
<body id="main">
<div class="frameL"><div class="menu icon">
    <jsp:include page="/${system}/common/itemmenu.jsp"/>
</div></div>

<div class="frameR"><div class="content">

	<c:url value="/${system}/item/brand/listBrand.do" var="backurl"/>
	
	<div class="loc icon"><samp class="t12"></samp>当前位置：商品管理&nbsp;&raquo;&nbsp;<a href="<c:url value="/${system }/item/brand/listBrand.do"/>" title="品牌管理">品牌管理</a>&nbsp;&raquo;&nbsp;<span class="gray">添加品牌</span>
    <a href="<c:url value="/${system }/item/brand/listBrand.do"/>" title="返回品牌管理" class="inb btn80x20">返回品牌管理</a>
    </div>
	<form id="form111" name="form111" action="${path }/brand/updateBrand.do" method="post" enctype="multipart/form-data">
		<div class="edit set">
			<input type="hidden" value="${brand.brandId }" name="brandId">
			<p><label><samp>*</samp>品牌名称：</label><input type="text" id="brandName" readonly="readonly" value="${brand.brandName }" name="brandName" class="text state" reg2="^[a-zA-Z0-9\u4e00-\u9fa5]{1,20}$" tip="必须是中英文或数字字符，长度1-20"/>
				<span></span>
			</p>
            <p><label class="alg_t"><samp>*</samp>品牌LOGO：</label><img id='imgsImgSrc' src="${upload }${brand.imgs}" height="100" width="100" />
            </p>
             <p><label></label><input type='file' size='27' id='imgsFile' name='imgsFile' class="file" onchange='submitUpload()' /><span id="submitImgTip" class="pos">请上传图片宽为120px，高为50px，大小不超过100K。</span>
                <input type='hidden' id='imgs' name='imgs' value='${brand.imgs }' reg2="^.+$" tip="亲！您忘记上传图片了。" /><span></span>
			</p> 
				
			<p><label>品牌网址：</label><input type="text" value="${brand.website }" name="website" class="text state" maxlength="100"  tip="请以http://开头" reg1="http:///*"/>
				<span class="pos">&nbsp;</span>
			</p>
			<p><label class="alg_t">品牌描述：</label><textarea rows="4" cols="45" name="brandDesc" class="are" reg1="^(.|\n){0,300}$" tip="任意字符，长度0-300">${brand.brandDesc }</textarea>
				<span class="pos">&nbsp;</span>
			</p>
			<p><label>排序：</label><input type="text" value="${brand.brandSort }" id="brandSort" reg1="^[1-9][0-9]{0,2}$" tip="排序只能输入1-3位数的正整数" name="brandSort" class="text small"/>
				<span class="pos">&nbsp;</span>
			</p>
		
			
			<p><label>&nbsp;</label><input type="submit" name="button1" d class="hand btn83x23" value="完成" /><input type="button" class="hand btn83x23b" id="reset1" value='取消' onclick="backList('${backurl}')"/>
			</p>
		</div>
	</form>
    <div class="loc">&nbsp;</div>

</div></div>
</body>

