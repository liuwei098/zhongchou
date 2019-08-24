<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="UTF-8">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/main.css">
	<link rel="stylesheet" href="css/pageStyle.css">
	<link rel="stylesheet" type="text/css" href="easyui/css/easyui.css" />
	<link rel="stylesheet" type="text/css" href="easyui/css/icon.css" />
	<style>
	.tree li {
        list-style-type: none;
		cursor:pointer;
	}
	table tbody tr:nth-child(odd){background:#F4F4F4;}
	table tbody td:nth-child(even){color:#C00;}
	</style>
  </head>

  <body>

    
	  <%@ include file="../commons/header.jsp" %>
    <div class="container-fluid">
      <div class="row">
         <%@ include file="../commons/commons.jsp" %>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<div class="panel panel-default">
			  <div class="panel-heading">
				<h3 class="panel-title"><i class="glyphicon glyphicon-th"></i> 数据列表</h3>
			  </div>
			  <div class="panel-body">
<form class="form-inline" role="form" style="float:left;">
  <div class="form-group has-feedback">
    <div class="input-group">
      <div class="input-group-addon">查询条件</div>
      <input class="form-control has-success" type="text" placeholder="请输入查询条件" id="rolename">
    </div>
  </div>
  <button type="button" class="btn btn-warning" onclick="searchRole()"><i class="glyphicon glyphicon-search"></i> 查询</button>
</form>
<button type="button" class="btn btn-danger" style="float:right;margin-left:10px;" onclick="DeleteSelectedRole()"><i class=" glyphicon glyphicon-remove"></i> 删除</button>
<button type="button" class="btn btn-primary" style="float:right;" onclick="window.location.href='form.html'"><i class="glyphicon glyphicon-plus"></i> 新增</button>
<br>
 <hr style="clear:both;">
          <div class="table-responsive">
            <table class="table  table-bordered">
              <thead>
                <tr >
                  <th width="30">#</th>
				  <th width="30"><input type="checkbox"></th>
                  <th>名称</th>
                  <th width="100">操作</th>
                </tr>
              </thead>
              <tbody>
                <c:forEach items="${ result.obj}" var="item" varStatus="status">
                	<tr>
	                  <td>${status.index+1+ (param.pageNum==null?0: (param.pageNum-1)*5) }</td>
					  <td><input type="checkbox" class="checkRole" onclick="addDeleteRole(${item.id})" value="${item.id }"></td>
	                  <td>${item.name }</td>
	                  <td>
					      <button type="button" class="btn btn-success btn-xs"><i class=" glyphicon glyphicon-check"></i></button>
					      <button type="button" class="btn btn-primary btn-xs"><i class=" glyphicon glyphicon-pencil"></i></button>
						  <button type="button" class="btn btn-danger btn-xs" onclick="deleteRole(${item.id})"><i class=" glyphicon glyphicon-remove"></i></button>
					  </td>
               	 </tr>
                </c:forEach>
               
              </tbody>
			  <tfoot>

			  </tfoot>
            </table>
               <div id="page" class="page_div"></div>
          </div>
			  </div>
			</div>
        </div>
      </div>
    </div>

    <script src="jquery/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="easyui/js/jquery.easyui.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
	<script src="script/docs.min.js"></script>
	<script src="jquery/paging.js"></script>
	<script type="text/javascript" src="layer/layer.js"></script>
        <script type="text/javascript">
            $(function () {
			    $(".list-group-item").click(function(){
				    if ( $(this).find("ul") ) {
						$(this).toggleClass("tree-closed");
						if ( $(this).hasClass("tree-closed") ) {
							$("ul", this).hide("fast");
						} else {
							$("ul", this).show("fast");
						}
					}
				});
            });
            
            var ids="";
       		
            //每点击一次checkBox触发这个方法，
            function addDeleteRole(id){
            	//ids=ids+id+",";
            }
      
            function DeleteSelectedRole(){
            	var a=$(".checkRole");
            	for(var i=0;i<a.length;i++){
            		if(a[i].checked){
            			ids=ids+a[i].value+",";
            		}
            	}
            /* 	QC - 品质控制
            	CMO / CMS - 配置管理员 */
           		$.post(
	              		"role_deleteRole",
	              		{"ids":ids},
	              		function(result){
	              			//alert(result.code);
	              			//成功用eaayui提示用户成功
	              			if(result.code==200){
	              				$.messager.show({  
	              			        title:'删除成功',  
	              			        msg:result.message,  
	              			        showType:'show',
	              			        timeout:2000
	              			   }); 
	              				window.location.href="role?pageNum=${param.pageNum}";
	              			}else{
	              				//失败用layer插件提示用户失败
	              				layer.msg('用户名或者密码错误', {
	              			    	    time: 5000, //20s后自动关闭
	              			    	    icon:5,
	              			    	   /*  shift:6, */
	              			    	    btn: ['明白了', '知道了']
	              			    });
	              			}
	              		},
	              		"json"
	             );
            	
            }
     	 /*       删除单个记录 */
            function deleteRole(id){
            	$.post(
            		"role_deleteRole",
            		{"ids":id},
            		function(result){
            			window.location.href="role?pageNum=${param.pageNum}";
            			//成功用eaayui提示用户成功
            			if(result.code==200){
            				$.messager.show({  
            			        title:'删除成功',  
            			        msg:result.message,  
            			        showType:'show',
            			        timeout:2000
            			   }); 
            			}else{
            				//失败用layer插件提示用户失败
            				 layer.msg('用户名或者密码错误', {
            			    	    time: 5000, //20s后自动关闭
            			    	    icon:5,
            			    	   /*  shift:6, */
            			    	    btn: ['明白了', '知道了']
            			    	 });
            			}
            		},
            		"json"
            	);
            }
     	 
     	 function searchRole(){
     		 var name=$("#rolename").val();
     		 window.location.href="role?name="+name;
     		 
     	 }
            
            $("tbody .btn-success").click(function(){
                window.location.href = "assignPermission.html";
            });
        </script>
        
         <script>
    //分页
	    $("#page").paging({
	    	pageNo:${result.page},
	        totalPage:${result.totalPage} ,
	        totalSize:${result.total},
	        callback: function(num) {
	        	window.location.href="role?pageNum="+num;	        }
	    })
	</script>
  </body>
</html>
