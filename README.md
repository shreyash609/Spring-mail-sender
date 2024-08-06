# Spring-mail-sender

                    Email Sending in Spring Boot

Steps for sending email in spring Boot


1) Add "mail-starter" dependency in pom.xml

2) Generate APP pwd for your gmail account

3) Configure SMTP props in application.properties file

4) Inject JavaMailSender to send emails

5) We can use below two classes to create mail

			a) SimpleMessage (plain text data)

			b) MimeMessage (html tags + attachments)
