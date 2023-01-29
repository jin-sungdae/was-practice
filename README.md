# CalculatorWAS

- Step1 - 사용자 요청을 메인 Thread가 처리하도록 한다.
- Step2 - 사용자 요청이 들어올 때마다 Thread를 새로 생성해서 사용자 요청을 처리하도록 한다.
- Step3 - Thread Pool을 적용해 안정적인 서비스가 가능하도록 한다.

### HTTP
- 서버와 클라이언트가 웹에서 데이터를 주고받기 위한 프로토콜(규약)
- 참고
  - HTTP/1,1, HTTP/2 는 TCP 기반 위에서 동작
  - HTTP/3는 UDP 기반 위에서 동작
- 클라이언트 - 서버모델
- 무상태 프로토콜(Stateless)
  - 서버가 클라이언트 상태를 유지하지 않음
  - 해결책 : Keep-Alive 속성 사용
- 비 연결성(Connectionless)
  - 서버가 클라이언트 요청에 대해 응답을 마치면 맺었던 연결을 끊어 버림
  - 해결책 : 쿠키(클라이언트에 정보 저장), 세션(서버에 정보 저장), JWT
 
## 객체
- HttpRequest
  - RequestLine
  - Header
  - Body
