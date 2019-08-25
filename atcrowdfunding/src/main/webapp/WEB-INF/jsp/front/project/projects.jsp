<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/theme.css">
	<style>
#footer {
    padding: 15px 0;
    background: #fff;
    border-top: 1px solid #ddd;
    text-align: center;
}
#topcontrol {
  color: #fff;
  z-index: 99;
  width: 30px;
  height: 30px;
  font-size: 20px;
  background: #222;
  position: relative;
  right: 14px !important;
  bottom: 11px !important;
  border-radius: 3px !important;
}

#topcontrol:after {
  /*top: -2px;*/
  left: 8.5px;
  content: "\f106";
  position: absolute;
  text-align: center;
  font-family: FontAwesome;
}

#topcontrol:hover {
    color: #fff;
    background: #18ba9b;
    -webkit-transition: all 0.3s ease-in-out;
    -moz-transition: all 0.3s ease-in-out;
    -o-transition: all 0.3s ease-in-out;
    transition: all 0.3s ease-in-out;
}

.label-type, .label-status, .label-order {
    background-color: #fff;
    color: #f60;
    padding : 5px;
    border: 1px #f60 solid;
}
#typeList  :not(:first-child) {
    margin-top:20px;
}
.label-text {
    margin:0 10px;
}
.panel {
    border-radius:0;
}
h3.break {
    font-size:16px;
    display: block;
    white-space: nowrap;
    word-wrap: normal;
    overflow: hidden;
    text-overflow: ellipsis;
}
h3.break>a {
    text-decoration:none;
}
	</style>
  </head>
  <body>
	<%@ include file="../commons/header.jsp" %>
    <div class="container theme-showcase" role="main">
	<%@ include file="../commons/nav.jsp" %>
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <ul id="typeList" style="list-style: none;">
                                <li>
                                    分类：<span class="label-type actvie">全部</span> <span class="label-text">科技</span> <span class="label-text">设计</span> <span class="label-text">公益</span> <span class="label-text">农业</span> <span class="label-text">文化</span>
                                </li>
                                <li>
                                    状态：<span class="label-status actvie">全部</span> <span class="label-text">即将开始</span> <span class="label-text">众筹中</span> <span class="label-text">众筹成功</span> 
                                </li>
                                <li>
                                    排序：<span class="label-order actvie">综合排序</span> <span class="label-text">最新上线</span> <span class="label-text">金额最多</span> <span class="label-text">支持最多</span>
                                </li>
                            </ul>
                        </div>
                        <div class="panel-footer" style="height:50px;padding:0;">
                            <div style="float:left;padding:15px;">
                            共216个众筹项目
                            </div>
                            <div style="float:right;">
                                <form class="navbar-form navbar-left" role="search">
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="请输入搜索内容">
                                    </div>
                                    <button type="submit" class="btn btn-default"><i class="glyphicon glyphicon-search"></i> 搜索</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row">
				<c:forEach items="${projects.getProjectList() }" var="project">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="project?id=${project.id }"><img alt="300x200"
										src="${project.titleimg }" /></a>
									<div class="caption">
										<h3 class="break">
											<a href="project">${project.name }</a>
										</h3>
										<p>
										<div style="float: left;">
											<i class="glyphicon glyphicon-screenshot" title="目标金额"></i>
											${project.money }
										</div>
										<div style="float: right;">
											<i title="截至日期" class="glyphicon glyphicon-calendar"></i>
											2017-20-20
										</div>
										</p>
										<br>
										<div class="progress" style="margin-bottom: 4px;">
											<div class="progress-bar progress-bar-success"
												role="progressbar" aria-valuenow="40" aria-valuemin="0"
												aria-valuemax="100" style="width: 40%">
												<span>${project.supportmoney*100/project.money}% </span>
											</div>
										</div>
										<div>
											<span style="float: right;"><i
												class="glyphicon glyphicon-star-empty"></i></span> <span><i
												class="glyphicon glyphicon-user" title="支持人数"></i> ${project.supporter }</span>
										</div>
									</div>
								</div>
							</div>
						</c:forEach>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-2.gif" />
						<div class="caption">
							<h3 class="break">
								<a href="project.html">酷驰触控龙头，智享厨房黑科技</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-3.png" />
						<div class="caption">
							<h3 class="break">
								<a href="project.html">小熊猫鱼眼全景安防摄像机</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-4.jpg" />
						<div class="caption">
							<h3 class="break">
								<a href="project.html">一款精致的机械表</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</div>
</div>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row">
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-1.jpg" />
						<div class="caption">
							<h3 class="break">
								<a href="project.html">活性富氢净水直饮机</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-2.gif" />
						<div class="caption">
							<h3 class="break">
								<a href="project.html">酷驰触控龙头，智享厨房黑科技</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-3.png" />
						<div class="caption">
							<h3 class="break">
								<a href="project.html">小熊猫鱼眼全景安防摄像机</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-4.jpg" />
						<div class="caption">
							<h3 class="break">
								<a href="project.html">一款精致的机械表</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</div>
</div>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row">
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-1.jpg" />
						<div class="caption">
							<h3 class="break">
								<a href="project.html">活性富氢净水直饮机</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-2.gif" />
						<div class="caption">
							<h3 class="break">
								<a href="project.html">酷驰触控龙头，智享厨房黑科技</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-3.png" />
						<div class="caption">
							<h3 class="break">
								<a href="project.html">小熊猫鱼眼全景安防摄像机</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="thumbnail">
						<img alt="300x200" src="img/product-4.jpg" />
						<div class="caption">
							<h3 class="break">
								<a href="project.html">一款精致的机械表</a>
							</h3>
                            <p>
                                <div style="float:left;"><i class="glyphicon glyphicon-screenshot" title="目标金额" ></i> $20,000 </div>
                                <div style="float:right;"><i title="截至日期" class="glyphicon glyphicon-calendar"></i> 2017-20-20 </div>
                            </p>
                            <br>
								<div class="progress" style="margin-bottom: 4px;">
                                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span >40% </span>
                                  </div>
                                </div>
                                <div><span style="float:right;"><i class="glyphicon glyphicon-star-empty" ></i></span>  <span ><i class="glyphicon glyphicon-user" title="支持人数"></i> 12345</span> </div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</div>
</div>
        
       

        <div class="container" style="margin-top:20px;">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <div id="footer">
                        <div class="footerNav">
                             <a rel="nofollow" href="http://www.atguigu.com">关于我们</a> | <a rel="nofollow" href="http://www.atguigu.com">服务条款</a> | <a rel="nofollow" href="http://www.atguigu.com">免责声明</a> | <a rel="nofollow" href="http://www.atguigu.com">网站地图</a> | <a rel="nofollow" href="http://www.atguigu.com">联系我们</a>
                        </div>
                        <div class="copyRight">
                            Copyright ?2010-2014atguigu.com 版权所有
                        </div>
                    </div>
                    
                </div>
            </div>
        </div>
      
    </div> <!-- /container -->
    <script src="jquery/jquery-2.1.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
	<script src="script/docs.min.js"></script>
    <script src="script/back-to-top.js"></script>
	<script>
$('#myTab a').click(function (e) {
  e.preventDefault()
  $(this).tab('show')
})
	</script>
  </body>
</html>