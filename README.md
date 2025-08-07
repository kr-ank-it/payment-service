# 💰 Madhyasth — Payment Service

Madhyasth is the dedicated payment orchestration microservice that bridges internal backend systems with third-party payment gateways. Built with scalability and extensibility in mind, it ensures reliable and traceable payment flows using adapters, callbacks, and webhooks.

---

## ✨ Key Features

- 🧩 **Adapter Pattern** to support pluggable payment providers (e.g., Stripe, Razorpay, etc.)
- 🔁 **Callback URL Redirection** after successful payment processing
- 🔔 **Webhook Handling** to ensure backend sync with payment provider events (payment success/failure)
- 💾 Tracks and stores transaction statuses for full traceability

---

## 📦 Tech Stack

- **Java 21**, **Spring Boot 3.5+**
- **Spring Web**, **Spring Configuration Processor**
- **Adapter Design Pattern**
- **RESTful callbacks** + **Webhook endpoints**

---

## 🔄 How the Payment Flow Works

1. Client initiates payment → directed to a chosen provider (e.g., Stripe)
2. After payment, provider redirects to backend via a **callback URL**
3. Simultaneously, the provider hits our **webhook endpoint** to ensure transaction confirmation
4. Backend marks the transaction as confirmed, and response is shared back with client/UI

---

## 📈 Impact

- 🔄 Improved **transaction consistency** through webhook fallbacks even if callbacks fail
- 🔌 Easily extensible architecture: Add new gateways with minimal changes
- 💡 Reduced integration complexity by centralizing all payment logic

---

## 🏁 How to Run

```bash
cd payment-service
./mvnw spring-boot:run
