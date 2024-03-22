# (15) Behavior Driven Development (BDD)

1. BDD tidak hanya digunakan untuk mengembangkan software dengan tepat, tetapi juga memastikan hal yang dikembangkan tersebut adalah software yang tepat. Terdapat beberapa tahapan dalam penulisan format BDD yang melibatkan pendekatan penulisan format Gherkin yaitu :
    - User Story
    - As a [X]-I want [Y]-So that [Z]
    - Scenario 
    - Given-When-Then

2. Cucumber merupakan tool yang digunakan dalam menginterpretasikan format Gherkin ini dan memvalidasi bahwa software berperilaku seperti yang dijelaskan dalam user stories tersebut. Dalam praktiknya, BDD menggabungkan aspek-aspek dari Test-Driven Development (TDD) dengan fokus tambahan pada kolaborasi antara stakeholders dan pemahaman bersama tentang fitur yang akan dikembangkan.

3. Pendekatan BDD dengan cucumber dilakukan dengan membuat normal scenario dan abnormal scenario. BDD dengan cucumber menerapkan beberapa step overview sebagai berikut :
    - Write Story : Gherkin Syntax (Given-When-Then)
    - Map Step to Java : Mengonfigurasikan skrip langkah dan validasi
    - Configure Stories : Menggabungkan 'stories' dengan langkah
    - Run Stories : Intellij IDEA, maven
    - View Reports
Beberapa tools yang dapat digunakan contohnya Java 1.8, Maven, maupun Intellij IDEA.
