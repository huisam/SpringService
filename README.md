## SpringBoot 예제 프로젝트

Spring에서의 BackEnd는 크게 5가지로 분류할 수 있다.

1. Domain
    * 웹 서비스에서 요구되는 `핵심 비즈니스 로직들`
    * Ex) 게시판의 글, 상품, 커피...etc
2. Repository
    * `DataBase`에 접근하기 위한 로직
    * Ex) JPA(Java Persistence API)
3. Dto
    * Domain에서 data를 전달하기 위한 `Data Transfer Object`
    * 필요한 data만 따로 정제해서 전달한다!
4. Service
    * Controller와 Repository 영역 사이의 `미들웨어 Object`
    * 실제로 사용자에게 서비스될 수 있는 로직들이 존재한다!
5. Controller
    * `HTTP`를 통한 `URL`를 매핑하는 로직을 담당하는 Object
    * URL에 대한 Service를 제공하는 로직을 담당한다!
    
Spring에서의 FrontEnd는 크게 3가지로 분류한다!

1. HTML(handlebars 이용)
    * `Handlebars`를 이용하게 되면, .html를 리턴할 필요가 없다!
    * Controller가 알아서 매핑해준다!
2. CSS
    * `디자인`을 담당하는 로직!
3. Javascript
    * `비동기형` 서비스를 제공하는 `jQuery`를 담당!
    * Ex) `게시글 등록`전 확인을 요구하는 로직 작성도 가능!
