### webServiceServer
- 新建项目选择webService项目
- 服务发布后在控制台执行：wsimport -s . http://10.9.0.161:8080/services?wsdl
- 将解析出来的文件导入到webService客户端
- 客户端调用：服务类名  service = new 服务类名();
    service.get服务类名Port.方法名();
