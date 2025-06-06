# ✈️ Flight Management System 4.0 – Java Console Application  
_By Anshdeep_

---

## 📖 Overview  
Flight Management System 4.0 is a console-based Java application simulating a complete airline ticketing and booking platform. This version brings significant upgrades over 3.0, including:

- 🔐 Role-based access (Admin, Agent, Passenger)  
- 📊 **New: Admin Analytics Dashboard**  
- 📩 HTML-based email booking confirmations  
- 📷 QR code ticket generation  
- 🍱 Food preference selection  
- 💺 Seat class management  
- 💳 Simulated payment flow  
- 📂 File-based storage & backup  
- ✅ Polished console UI for real-world use simulation  

---

## 🛠️ Features (Version 4.0)

### ✅ Implemented in 4.0  
- 🎫 Booking and Cancellation System  
- 🔐 Role-Based Access: Admin, Agent, Passenger  
- 🛫 Flight Info: Flight ID, Route, Date, Time  
- 💺 Seat Classes: Economy, Business, First  
- 🍱 Food Options: Veg, Non-Veg  
- 💳 Simulated Payment Confirmation  
- 📬 Email Confirmation (HTML)  
- 📷 QR Code Ticket Generation (PNG)  
- 📁 File-based Input/Output and Logs  
- 📦 CSV Export of Bookings  
- 📑 Clean and modular Java structure  
- 📊 **Admin Analytics Dashboard** – View total bookings, food stats, class usage

---

## 🧭 Planned Enhancements

| Step | Feature            | Status   | Description                         |
|------|--------------------|----------|-------------------------------------|
| 1️⃣  | Password Hashing   | Pending  | Secure login with SHA-256           |
| 2️⃣  | OTP Login          | Pending  | Secure one-time password login      |
| 3️⃣  | Booking History    | Pending  | Per-user booking log                |
| 4️⃣  | Flight Filters     | Pending  | Search by route/date/seat class     |
| 5️⃣  | GUI Interface      | Planned  | Dialog/JavaFX-based UI              |
| 6️⃣  | Web/Mobile Version | Planned  | Spring Boot backend + React frontend|

---

## 🧾 Booking Confirmation Sample

### Email Confirmation Screenshot

Here is a screenshot of the confirmation email received after booking:

![Confirmation Email](images/Screenshot_2025-05-26_223728.png)


✅ Booking ID, Flight ID  
🛫 Flight details (e.g., FL102 (IND–DEL, 6:00PM))  
💺 Seat class & 🍱 food option  
📬 HTML confirmation + 📷 QR Ticket  

---

## 🛠 How It Works  
- 📥 Takes user input via Java Scanner  
- 📤 Outputs confirmation and status in `output.txt`  
- 📦 Saves data in structured files (`booking_log.txt`, `bookings.csv`)  
- 📨 Sends confirmation email with ticket details (HTML format)  
- 📷 Generates QR code for each booking using ZXing  
- 💳 Simulates payment without real transactions  
- 📊 Shows total bookings, food preferences, seat usage by class  

---

## 🖥 Technologies Used  
- Java (Core + File I/O)  
- JavaMail API  
- ZXing QR Code Library  
- Simple HTML/CSS for Email Format  
- Git for version control  

---

## 📁 Project Structure
FlightManagementSystem4.0/
├── Booking.class
├── bookings.csv
├── booking_log.txt
├── Flight.class
├── FlightManagementSystem.class
├── FlightManagementSystem.java
├── input.txt
├── output.txt
├── Utils.java
├── admin/
│ └── AdminAnalytics.java
├── auth/
│ └── AuthUtil.java
├── booking/
│ ├── Booking.class
│ ├── Booking.java
│ ├── Flight.class
│ ├── FoodOption.java
│ └── SeatClass.java
├── email/
│ ├── booking_confirmation.html
│ ├── EmailConfig.class
│ ├── EmailConfig.java
│ ├── EmailService.class
│ ├── EmailService.java
│ └── output.txt
├── lib/
│ ├── core-3.5.1.jar
│ ├── javase-3.5.1.jar
│ ├── javax.activation-1.2.0.jar
│ └── javax.mail-1.6.2.jar
├── qr/
│ ├── QRGenerator.class
│ └── QRGenerator.java
├── qr_codes/
└── search/
├── SearchUtil.java
└── users.txt

## 👨‍💻 About the Developer

**Anshdeep** — CSE Student at Chitkara University

📧 Personal Email: [anshdeeep24072004@gmail.com](mailto:anshdeeep24072004@gmail.com)  
🎓 University Email: [anshdeep1779.be23@chitkara.edu.in](mailto:anshdeep1779.be23@chitkara.edu.in)

---
