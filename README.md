
# SimpleBoard 게시판 프로젝트

이 프로젝트는 Spring Boot, JPA, Gradle 및 Java 11을 사용하여 만들어졌습니다. 이 게시판은 질문, 답변, 회원가입, 로그인, 검색, 추천 서비스 및 페이징 기능을 포함하고 있습니다.

## 시작하기

이 지침을 따라 프로젝트를 실행하고 테스트할 수 있습니다.

### 요구 사항

- Java 11 이상
- Gradle

### 설치 및 실행

1. 이 저장소를 클론합니다.

```bash
git clone https://github.com/huisuSeo/SimpleBoard.git
```

2. 프로젝트 폴더로 이동합니다.

```bash
cd your-repository
```

3. 프로젝트를 빌드합니다.

```bash
gradle build
```

4. 애플리케이션을 실행합니다.

```bash
gradle bootRun
```

5. 웹 브라우저에서 `http://localhost:8080`으로 접속하여 애플리케이션을 확인합니다.

## 기능

- **회원가입 및 로그인**: 사용자는 회원가입을 할 수 있고, 등록된 사용자는 로그인하여 서비스를 이용할 수 있습니다.
- **질문 및 답변 작성**: 사용자는 질문을 작성하고 다른 사용자가 답변을 제공할 수 있습니다.
- **검색**: 사용자는 키워드를 사용하여 게시글을 검색할 수 있습니다.
- **추천 서비스**: 추천 기능을 통해 사용자에게 관련된 게시글을 제공합니다.
- **페이징**: 게시글 목록을 페이징하여 표시합니다.

## 기술 스택

- Spring Boot
- Spring Data JPA
- Gradle
- Java 11

## 기여

이 프로젝트에 기여하고 싶으시다면, [기여 가이드라인](CONTRIBUTING.md)을 확인해주세요.

## 라이선스

이 프로젝트는 MIT 라이선스 하에 배포됩니다. 자세한 내용은 [LICENSE](LICENSE) 파일을 참조해주세요.

## 저자

- 이름
- 이메일
- GitHub: [GitHub 프로필 링크](https://github.com/huisuSeo)
