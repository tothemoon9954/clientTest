# clientTest

### client 설정 파일
  spring:
    application:
      name: eureka     # 어플리케이션 이름 = Github 레포지토리에서 관리하는 파일 애플리케이션 이름
    profiles:
      active: dev     # 애플리케이션 환경 = local, dev
    config:
      import: optional:configserver:http://localhost:8888 # import:optional:configserver사용 -> Spring cloud config server 주소
  server:
    port: 9001     # Spring Cloud Config Client 주소
    
  management:    // 클라이언트 코드에서 Actuator 설정
    endpoints:
      web:
        exposure:
          include: "*"

  eureka:
    instance:
      instance-id: clientTest

### pom.xml
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>`
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-config</artifactId>
		</dependency>

