# demo-greylog
Graylog is a log management tool that seamlessly collects, enhances, stores, and analyzes log data.

Log data is stored in Elasticsearch and is searchable through the Graylog GUI.
Elasticsearch nodes should have as much RAM as possible and the fastest disks you can get. Everything depends on I/O speed here.
MongoDB is used to store meta information and configuration data. and doesn’t need many resources.

Please check Installation Guide at the following location:
https://docs.graylog.org/en/3.3/pages/installation.html

For the sake of simplicitity, docker_compose file is created with required versioning for quick start purpose.

Please refer the below link for architectural considerations.
https://docs.graylog.org/en/3.3/pages/architecture.html

A demo of this tool is created to showcase it's basic usage integration needs with various programming runtimes such as java spring-boot, python, go etc.

**Graylog integrationa**: The client library has unsolvable Vulnerabiities

The following Vulnerabilities were reported by [OWASP DependencyCheck](https://owasp.org/www-project-dependency-check/)
- NVDCVE-2018-11650 Medium CWE-79
- NVDCVE-2018-11651 Medium CWE-79
- NVDCVE-2018-14380 Medium CWE-79
- NVDCVE-2020-15813 High CWE-295
- NVDCVE-2018-11650 Medium CWE-79
- NVDCVE-2018-11651 Medium CWE-79
- NVDCVE-2018-14380 Medium CWE-79
- NVDCVE-2020-15813 High CWE-295

Latest version for Log4j2 GELF (Log4j2 GELF » 1.3.1) was published on Oct, 2016
https://mvnrepository.com/artifact/org.graylog2.log4j2/log4j2-gelf

