# gnt

Java: 11 설치


## mongodb 세팅
6.0 버전 설치
* windows:
  * https://khj93.tistory.com/entry/MongoDB-Window%EC%97%90-MongoDB-%EC%84%A4%EC%B9%98%ED%95%98%EA%B8%B0
  * mongodb compass도 설치할 것
  * compass 상에서 gnt db를 만들고, topics collection을 만든다

* macos:
```
brew tap mongodb/brew
brew install mongodb-community@6.0
brew services start mongodb-community
mongosh
```
그 다음 mongodb shell에서 `use gnt`

## Springboot 세팅
1. IntelliJ로 core 디렉토리를 Open한다
2. gradle build가 다 될 때까지 기다린다
3. File -> Preferences(Settings) -> Build, Execution, Deployment -> Build Tools -> Gradle
   * Build and run using: IntelliJ IDEA로 변경
   * Run tests using -> IntelliJ IDEA로 변경
4. Annotation Processors -> Enable annotation processors 체크
5. CoreApplication의 main 함수 실행
