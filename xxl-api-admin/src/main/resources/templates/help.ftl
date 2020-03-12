<!DOCTYPE html>
<html>
<head>
  	<title>Api管理平台</title>
  	<#import "common/common.macro.ftl" as netCommon>
	<@netCommon.commonStyle />
</head>
<body class="hold-transition skin-blue sidebar-mini <#if cookieMap?exists && cookieMap["adminlte_settings"]?exists && "off" == cookieMap["adminlte_settings"].value >sidebar-collapse</#if> ">
<div class="wrapper">
	<!-- header -->
	<@netCommon.commonHeader />
	<!-- left -->
	<@netCommon.commonLeft "help" />
	
	<!-- Content Wrapper. Contains page content -->
	<div class="content-wrapper">
		<!-- Main content -->
		<section class="content">
			<div class="callout callout-info">
				<h4>Api管理平台</h4>
				<br>
				<p>
                    <a target="_blank" href="https://github.com/ztc/xxl-api">Github</a>&nbsp;&nbsp;&nbsp;&nbsp;
					<iframe src="https://ghbtns.com/github-btn.html?user=ztc&repo=xxl-api&type=star&count=true" frameborder="0" scrolling="0" width="190px" height="20px" style="margin-bottom:-5px;"></iframe>
					<br><br>
                    <a target="_blank" href="http://www.ztc.com/xxl-api/">官方文档</a>
                    <br><br>

				</p>
				<p></p>
            </div>
		</section>
		<!-- /.content -->
	</div>
	<!-- /.content-wrapper -->
	
	<!-- footer -->
	<@netCommon.commonFooter />
</div>
<@netCommon.commonScript />
</body>
</html>
