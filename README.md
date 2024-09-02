<h1 align="center" style="font-weight: bold;">CRUD - Simples 💻</h1>

<p align="center">
    <b>Projeto visa efetuar um CRUD simples utilizando o Framework Spring para prática.</b>
</p>

<h2 id="technologies">💻 Tecnologias</h2>

- PostgreSQL 
- Java
- Spring Boot


<h2 id="routes">📍 API Endpoints</h2>

Como se trata de um uma API voltada para um CRUD simples, serão listados os endpoints e como são enviados os bodys para cada método
​
| Rota              | Descrição
|----------------------|-----------------------------------------------------
| <kbd>GET /produtos</kbd>     | Retorna os produtos registrados com o campo <code>active=true</code> [Detalhes da requisição](#get-auth-detail)
| <kbd>POST /produtos</kbd>     | Envia os dados de um novo produto para ser cadastrado [Detalhes da requisição](#post-auth-detail)
| <kbd>PUT /produtos</kbd>     | Atualiza os dados caso o <code>ID</code> informado seja válido [Detalhes da requisição](#put-auth-detail)
| <kbd>DELETE /produtos/{id}</kbd>    | Altera o campo <code>active=false</code> caso o <code>ID</code> informado seja válido



<h3 id="get-auth-detail">GET /produtos</h3>

**RESPONSE**
```json
[
    {
        "id": "a3e8f56e-9660-4d00-8935-7fcf26b4f1be",
        "name": "Maça",
        "supplier": "José",
        "dt_validity": "2026-05-14T03:00:00.000+00:00",
        "dt_manufacture": "2023-05-16T03:00:00.000+00:00",
        "amount": 48,
        "active": true
    },
    {
        "id": "33a953d7-ffd7-47f1-a97c-a362341c22e3",
        "name": "Goiaba",
        "supplier": "MariaMaria",
        "dt_validity": "2025-04-22T03:00:00.000+00:00",
        "dt_manufacture": "2024-12-19T03:00:00.000+00:00",
        "amount": 66,
        "active": true
    }
]
```

<h3 id="post-auth-detail">POST /produtos</h3>

**REQUEST**
```json
{
    "name": "Goiaba",
    "supplier": "Maria",
    "dt_validity" : "2025-04-22",
    "dt_manufacture" : "2024-12-19",
    "amount" : 66
}
```

**RESPONSE**
```json
{
    "name": "Goiaba",
    "supplier": "Maria",
    "dt_validity": "2025-04-22",
    "dt_manufacture": "2024-12-19",
    "amount": 66
}
```

<h3 id="put-auth-detail">PUT /produtos</h3>

**REQUEST**
```json
  {
    "id": "33a953d1-a97c-a362341c22e3",
    "name": "Goiaba",
    "supplier": "MariaMaria",
    "dt_validity": "2025-04-22T03:00:00.000+00:00",
    "dt_manufacture": "2024-12-19T03:00:00.000+00:00",
    "amount": 66
}
```

**RESPONSE**
```json
{
    "id": "a3e8f56e-9660-4d00-8935-7fcf26b4f1be",
    "name": "Goiaba",
    "supplier": "MariaMaria",
    "dt_validity": "2025-04-22T03:00:00.000+00:00",
    "dt_manufacture": "2024-12-19T03:00:00.000+00:00",
    "amount": 66
}
```

## License

Este software está disponível sob as seguintes licenças:

- [MIT](https://rem.mit-license.org)
