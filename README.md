# Pagamentos Microservice — AluraFood

> 🚧 **Status do projeto:** Em desenvolvimento ativo (primeiro commit). Muitas funcionalidades, refatorações e integrações ainda serão implementadas.

Estudo prático sobre **arquitetura de microsserviços**, partindo da evolução de um sistema monolítico de restaurante para serviços independentes. Este repositório contém o módulo inicial de **pagamentos** (`br.com.alurafood.pagamentos`).

## 🛠️ Tecnologias e ferramentas
* **Java** e **Maven**[cite: 1]
* **Spring Boot** (`spring.application.name=pagamentos`)[cite: 1]
* **ModelMapper** (configurado em `PagamentoConfig`)[cite: 1]

## 📁 Estrutura inicial
* `config/` — Configurações da aplicação (`PagamentoConfig`)[cite: 1]
* `Controller/` — Endpoints REST (`PagamentoController`)[cite: 1]
* `Service/` — Regras de negócio (`PagamentoService`)[cite: 1]
* `Repository/` — Camada de acesso a dados (`PagamentoRepository`)[cite: 1]
* `Entity/` e `Entity/Enums/` — Entidade `Pagamento` e enum `Status`[cite: 1]
* `dto/` — Objetos de transferência de dados (`PagamentoDto`)[cite: 1]

## 📌 Próximos passos (Roadmap inicial)
- [ ] Concluir e refinar os fluxos do serviço e controller de pagamentos
- [ ] Configurar banco de dados e migrações de schema
- [ ] Adicionar validações, tratamento de exceções e testes automatizados
- [ ] Integrar com os demais microsserviços do ecossistema do restaurante e service discovery/gateway