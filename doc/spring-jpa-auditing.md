# Spring Data Jpa Auditing
> Audit: 회계 감사, 감사하다

테이블 설계시 항상 공통적으로 들어가는 **생성일자, 수정일자 등의 컬럼에 대해 자동으로 값을 넣어주는 기능**을 Spring-Data-Jpa에서 제공한다.

### @EnableJpaAuditing 활성화
```java
@EnableJpaAuditing
@Configuration
public class DatabaseConfig {
  @Bean
   public DataSource dataSource() {
...
```
@EnableJpaAuditing 어노테이션을 활성화 시켜줘야 한다. 위치는 Config 클래스나 Application.class와 같은 root 클래스에 추가한다.
### Entity 설정
```java
@Entity
@Table(name = "BOARD")
@IdClass(BoardPk.class)
@Getter
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {
...
  @CreatedDate
  @Column(name = "CREATE_DATE", nullable = true, unique = false, updatable = false)
  private LocalDateTime createDate;

  @LastModifiedDate
  @Column(name = "LAST_MODIFIED_DATE", nullable = true, unique = false, updatable = true)
  private LocalDateTime lastModifiedDate;
```
1. @EntityListeners(AuditingEntityListener.class) 추가
2. @CreatedDate와 같은 Auditing 대상 필드를 추가한다.

AuditingEntityListener 클래스는 @PrePersist, @PreUpdate가 달린 메서드를 통해 엔티티가 영속화 되기전에 AuditingHandler를 통해 값을 자동으로 찾아 설정한다.
### 데이터 추가 해보기
필자는 샘플프로젝트에 셋업하여 데이터를 추가했다.
![결과](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdcfWHd%2FbtqF7tn6X55%2FJebDI8OkBWx20D5plkr9Wk%2Fimg.png)
CREATE\_DATE나 LAST\_MODIFIED\_DATE에 대한 데이터를 넘겨주지 않았지만 Auditing 기능으로 자동으로 값이 입력된걸 볼 수 있다.