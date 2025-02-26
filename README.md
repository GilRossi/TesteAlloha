•	Questão 5: Design Patterns
Explique o padrão de projeto Singleton e implemente uma versão thread-safe em Java.

Singleton : um padrão de projeto criacional que garante que uma classe tenha apenas uma instância e forneça um ponto de acesso global a ela. É útil em cenários onde uma única instância deve controlar ações, como configurações globais, conexões de banco de dados ou gerenciadores de recursos. Impede a instanciação direta via new, armazena a única instância da classe e retorna a instância única (criando-a, se necessário).
