# webflux-practice-say-hello

## Practice 1.
> REST API 에 반응하는 local 웹 서버 앱 구축하기

### Request
```
GET localhost:8080/hello?name=$name
```

### Response
```application/json
{ “to”: “$name”, “message”: “hello $name” }
```

---
<br>

## Practice 2.
> `WebClient`를 이용하여 REST API 로 내부 통신하는 MSA 구축하기 <br>
> [Port 8080](https://github.com/boookk/webflux-practice-say-hello) ↔ [Port 8081](https://github.com/boookk/webflux-practice-info-service)

### Request
```
GET localhost:8080/hello?name=$name
```

### Response
```application/json
{ “to”: “$name”, “job”: “”, “message”: “hello $name” }
```
