# kotlin-dagger-rxjava

  Esse projeto tem o objetivo de ajudar as pessoas que estão começando a trabalhar com kotlin, dagger e rxjava, utilizamos uma padrão de projeto de arquitetura chamado MVP, para facilitar a manutenção do código e facilitar na inserção de módulos de teste ou rede sociais futuramente, podem baixar e utilizar facilmente em projetos pessoais e projetos profissionais, fácil de entender e fácil de dar manutenção.

## kotlin
  
  Kotlin é uma linguagem da JetBrains, famosa por suas IDE's (RubyMine, IntelliJ, PhpStorm, etc), que foi construída para ser usada internamente pela empresa e foi pensada visando melhor legibilidade, produtividade e suprir limitações que a JetBrains vinha enfrentando com Java.
  Kotlin é a nova linguagem de programação que tem dado de falar na actualidade, foi criado pela jetbrains e teve 6 anos de desenvolvimento (2010–2016), pelos anos de desenvolvimento pode se perceber que não é uma linguagem que surge como uma brincadeira, mas sim é algo estável e sério.
  
  mais informações no links abaixo:
  
  https://medium.com/android-dev-br/kotlin-primeiros-passos-b9035259e63a
  
  https://medium.com/kotlin-para-android/introdu%C3%A7%C3%A3o-a-kotlin-51a4355f3bc8
  
  http://blog.triadworks.com.br/uma-breve-introducao-a-kotlin
  
  esse link foi onde turbinei meu aprendizagem em kotlin
  
  https://www.youtube.com/watch?time_continue=1&v=FHZ6bI3zb4M
  
  
  ## Dagger 2
  
  O Dagger 2 é um framework mantido pela google que tem por objetivo realizar a injeção de dependência em projetos Android e Java. Ele foi criado a partir do Dagger 1 que foi desenvolvido pela Square.
  Importante ressaltar que o Dagger é para o Java, a Injeção de Dependência é um design pattern de programação, para qualquer linguagem.
  
  mais informações no links abaixo:
  
  https://medium.com/android-dev-br/introdu%C3%A7%C3%A3o-ao-dagger-2-56d193118a6c
  
  https://www.thiengo.com.br/injecao-de-dependencia-com-a-lib-dagger-2-no-android
  
  https://www.concrete.com.br/2016/08/17/dagger-2-um-ano-depois/
  
  ## RxJava
  
  Programação Reativa é descrita simplesmente como programação utilizando um fluxo de dados assíncrono. Porém, este não é um novo conceito, outros padrões também utilizam esse significado.
  A RxJava possui características interessantes como facilidade de controlar concorrência, de forma a melhorar o uso do poder de processamento dos seus servidores; facilidade na execução condicional de tarefas assíncronas; melhoria quanto a evitar o problema de uso de vários callbacks (evitar o uso excessivo do padrão Observer) e abordagem reativa.
  
  https://www.devmedia.com.br/programacao-reativa-com-a-biblioteca-rxjava/33651
  
  https://medium.com/@spparks_/rxandroid-introdu%C3%A7%C3%A3o-b%C3%A1sica-primitivos-rxjava-599029ec1595
  
  https://www.infoq.com/br/presentations/programacao-reativa-com-rx
  
  # Projeto Kotlin
  
  Nesse projeto estamos consumindo desse json expecificado no link:
  
  https://api.androidhive.info/contacts/
  
  Nesse projeto estamos trabalhando com 5 pacotes com suas respectivas classes, conforme mostrado na figura abaixo:
  
  ![captura de tela de 2018-01-15 17-44-30](https://user-images.githubusercontent.com/5742609/34959125-138a84e2-fa1c-11e7-9cf4-46c3a2096089.png)
  
  Aqui criamos a classe MainModule do dagger na versão do kotlin conforme a figura abaixo:
  
  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  



