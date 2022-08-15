package hello.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient {
    // 인터페이스를 사용하는 초기화, 종료 방법 단점
    // implements InitializingBean, DisposableBean
    // 스프링 초창기 방법이라서 거의 사용하지 않는다
    // 1. 스프링에 의존 (애너테이션 정도는 괜찮은데 코드 레벨은 부담)
    // 2. 초기화, 소멸 메서드 이름 변경 불가
    // 3. 외부 라이브러리에 적용할 수 없다


    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);

    }

    public void setUrl(String url) {
        this.url = url;
    }

    // 서비스 시작시 호출
    public void connect() {
        System.out.println("connect: " + url);
    }

    public void call(String message) {
        System.out.println("call: " + url + " message = " + message);
    }

    // 서비스 종료시 호출
    public void disconnect() {
        System.out.println("close " + url);
    }

    // @PostConstruct, @PreDestroy 유일한 단점 : 외부 라이브러리를 사용하지 못한다
    @PostConstruct
    public void init() throws Exception {
        System.out.println("NetworkClient.afterPropertiesSet");
        connect();
        call("초기화 연결 메시지");
    }

    @PreDestroy
    public void close() throws Exception {
        System.out.println("NetworkClient.destroy");
        disconnect();
    }
}
