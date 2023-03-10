# Anatomia das Classes 1

> Uma classe bem estruturada não quer guerra com ninguém.
> 

*Quando a gente consegue montar um arquivo Java, que é a essência de todo o código fonte da linguagem (classes), cuja estrura contem coerência, padrões e outros requisitos, percebemos que fica mais sutil para ser compreendido, dar manutenção e desfrutar dos recursos.*

- A escrita de códigos de um programa é feita através da composição de palavras pré-definidas pela linguagem com as expressões que utilizamos para determinar o nome dos nossos arquivos, classes, atributos e métodos ⇒ caracterização das nomenclaturas.
- É muito comum mesclarmos expressões do idioma inglês com o nosso vocabulário. Existem projetos que recomendam toda a implementação do programa na lingua inglesa.

**Sintaxe de declaração de uma nova classe:**

```java
public class MinhaClasse {

	// SEU CÓDIGO AQUI
}
```

⇒ inicamos o projeto criando um *arquivo.java*, que tem um padrão:

- nome do arquivo, normalmente do *public class*:
- este nome deve ser coerente com a expressão que vamos escrever, o conteúdo que vamos representar. Todo este conteúdo fica inserido dentro das {}.
- métodos
- variáveis
- expressões

### **Criando uma classe inicial**

**Passo-a-passo realizado:**

1. instalar extensão java no vs code
2. no vs code > ctrl + shift + p para iniciar projeto
3. escolher opção create java project
4. escolher onde salvar o repositório na máquina
5. dar um nome ao projeto utilizando convenção de letras minúsculas e traços para separar palavras

*Todo o código será consistido no arquivo/pasta src que já cria uma classe chamada App.java que na hora da compilação se converte em uma classe e que já traz uma estrutura public static.*

1. excluir o arquivo App.java
2. criar novo arquivo ‘MinhaClasse.java’ > convenção de todos os arquivos/classes sempre começar com a primeira letra das palavras maiúsculas. > quando formos criar métodos e variáveis, esta regra vai sofrer alterações.

*Como foi sugerido, a maioria das classes vão começar com esse prefixo:*

*public class + nome da minha classe + bloco de código entre chaves*

1. aspectos: o que escrever dentro de uma linguagem java? Se a minha classe é executável, ou seja, tem a capacidade de realizar a inicialização do projeto de forma independente, ela precisa ter um método principal, especial, denominado método main. > este método tem uma característica única na inicialização e segue o seguinte padrão:

```java
public static void main (String [] args){

}
```

*void significa que não vai retornar nada; main é o nome do método; espera um parâmetro especial do tipo string; a gente determina este parâmetro como um array, representado pelos colchetes, chamado args. Dentro deste método também haverá um corpo, que é representado pelas chaves > tudo que for escrito dentro deste corpo também pertence à classe, mas a fronteira de método determina se será inicializado ou não, o que for escrito no corpo do método main só vai existir dentro do método main.*

*parâmetro string: além das classes que a gente cria, a linguagem já tem as classes que representam tipos, funções, datas, operações, etc.*

*toda classe precisa existir dentro do arquivo src do seu projeto.*

---

# Anatomia das Classes 2

> Padrão de nomenclatura: tão importante quanto o algoritmo no qual será implementado.
> 

Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. Esses padrões estão expressos abaixo:

- **Arquivo .java:** todo arquivo .java deve começar com a letra maiúscula. Se a palavra for composta, a segunda palavra também deve começar com a letra maiúscula, exemplo:

 

```java
Calculadora.java, CalculadoraCientifica.java
```

- **Nome da classe no arquivo:** a classe deve possuir o mesmo nome do arquivo .java, exemplo:

```java
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {

}
```

- **Nome de variável:** toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra das demais palavras deve ser maiúscula. Exemplo:

```java
ano, anoFabricacao
```

O nome dessa prática para nomear variáveis dessa forma se chama “camelCase”.

Para declarar uma variável, nós podemos utilizar caracteres, números e símbolos, porém devemos seguir algumas regras de linguagem:

1. deve conter apenas letras, _, $ ou os dígitos de 0 a 9
2. deve obrigatóriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número
3. deve iniciar com uma letra minúscula (boa prática)
4. não pode conter espaços
5. não pode usar palavras-chave da linguagem
6. o nome deve ser único dentro de um escopo

```java
// Declaração inválida de variáveis

int numero&um = 1;
int 1numero = 1;
int numero 1 = 1;
int long = 1;

// Declaração válida de variáveis

int numero$um = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;
```

Existe uma regra adicional para variáveis quando na mesma queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que uma variável de nome **br** sempre representará ************Brasil************ e nunca mudará seu valor, logo, determinamos como escrito no código abaixo:

```java
final String BR = "Brasil";
final double PI = 3.14;
final int ESTADOS_BRASILEIROS = 27;
final int ANO_2000 = 2000;
```

utilizar a expressão final; representar a variável toda em letras maiúsculas.

---

# Anatomia das Classes 3

Declaração de variáveis e métodos

> Conseguimos identificar através de algumas estruturas, quando estamos nos referindo a uma variável ou a um método na aplicação.
> 
- Toda variável na linguagem Java tem necessidade de tipo e nome bem definidos e, opcionalmente um valor.

```java
// Exemplo

int idade = 23;
double altura = 1,62;
Dog spike; // aqui a variável spike não tem valor
boolean verdadeira = true;
```

- Métodos têm estruturas bem simples:
1. tipo de retorno 
2. nome de objetivo no infinitivo (proposta bem definida)
3. parâmetros (opcional)

```java
TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
// Exemplo

int somar (int numeroUm, int numero22);

String formatarCep (long cep)
```

---

# Anatomia das Classes 4

> A medida que a gente vai implementando alguns projetos, os arquivos tendem a ter uma certa extensão de conteúdos, códigos e altoritimos. Por isso, utilizamos a estratégia de indentação ⇒ uma forma de tabular o código para que ele tenha uma compreeensão a nível de escopo da proposta de implementação. Aspecto relevante no que se refere a visualização e interpretação dos códigos.
> 
- Basicamente, **indentar** é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.
- Utilizar ctrl + K + ctrl + F para formatar as linhas selecionadas, ou ctrl + shift + I para formatar o documento.

---

# Anatomia das Classes 5

> A medida que o sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização desses arquivos através de pacotes (packages). Esta é uma forma de criar uma estrutura de subdiretórios (pacotes), para uma melhor organização dos arquivos.
> 
- Existe uma convensão desses sbdiretórios; analogia: assim como as empresas possuem segmentos (comercial, organizacional, opensource, etc), para os projetos existem finalidades. Grande parte dos projetos possuem estas propostas:

abrevia-se  com os prefixos = comercial como ***com***, organizacional como ***org***, open source como ***org*** ou ***opensource***

Imagine que a empresa referisa se chama HyperTech, seus projetos são comerciais. Então temos o seguinte prefixo da proposta/do projeto ⇒ o *********com********* + o nome da empresa + o nome da aplicação, demonstrado a seguir:

```java
com.hypertech.notification
```

a partir deste pacote, onde a identidade da empresa ganha ênfase, pode-se ter mais subpacotes com diferentes finalidades:

```java
com.hypertech.notification.app
com.hypertech.notification.modelo
com.hypertech.notification.util
com.hypertech.notification.service
```

---

# Anatomia das Classes 6

> Uma das maiores dificuldades na programação é escrever algoristmos legíveis a níveis que sejam compreendidos por todo o seu time ou por você mesmo no futuro. Para isso, a linguagem Java sugere, através de convenções, formas de escrita universal para as classes, atributos, métodos, variáveis, pacotes.
> 
- Java Beans é uma iniciativa conceitual da comunidade para que a gente possa ter uma estruturação da escrita, expressão das variáveis, classes, métodos etc, para que os códigos sejam o mais claro e coezo possível diante da proposta do algoritmo.
- Falando de variáveis, há algumas sugestões de nomenclatura:
1. uma variável precisa ser clara, sem abreviações ou definição sem sentido
2. uma variável é sempre no singular, exceto quando se referir a um array ou coleção
3. defina um idioma único para suas variáveis, se você for declarar variáveis em ingles, defina todas em inglês
4. **não recomendado**: 

```java
double salMedio = 1500,23; // variável abreviada de Salário Médio
String emails = jujuba@hotmail.com; // uso do plural desnecessário
String myName = "Joseph"; // se o idioma é pt-BR, mesmo que o valor seja em inglês, o ideal é que o tipo seja em pt-BR
```

1. ****************correto:****************

```java
double salarioMedio = 1500,23;
String [] emails = jujuba@hotmail.com;
String meuNome = "Joseph";
```

1. por mais que o código seja escrito em português, algumas bibliotecas contém métodos que serão chamados em inglês
- Métodos devem ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. A princípio, todas as letras que compõe o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta a partir da segunda palavra. Exemplo:

```java
somar (int n1, int n2) {}

abrirConexao () {}

concluirProcessamento () {}

findById (int id) {}

calcularImprimir () {} // há algo de errado, ele deveria ter uma única finalidade, afinal ele é um método calcular ou um método imprimir?
```

---

# Tipos e Variáveis

- Explorar os tipos de dados numéricos, inteiros, numéricos decimais, lógicos, caracteres e suas aplicabilidades.
- Diferença de variáveis e constantes.
- Objetos.

### Requisitos

JDK

IDE

Diretório do projeto

Integração com Github

## Criando o projeto

1. criar um repositorio no Github chamado dio-trilha-java-basico
2. selecionar opções de readme e .gitignore para java ao criar o repositório remoto
3. copiar link https do repositório remoto no github
4. ctrl + shift + p no vs code para iniciar novo projeto
5. pesquisar por create new java project
6. selecionar no build tools
7. selecionar a pasta destino no disco rígido
8. nomear o projeto
9. colar o link do projeto copiado do Github
10. no ícone do git no vs code, determinar a pasta de arquivo json como gitignore
11. renomear o arquivo App.java para o nome do projeto > TiposVariaveis.java
12. escrever a mensagem do commit
13. commitar

---

- Após configurar a IDE e validar a integração ao repositório do Github, vamos entender a proposta de tipos e variáveis na linguagem.
- O que são tipos de dados?

Palavras reservadas para a representação dos tipos de dados básicos, que precisam ser manipulados para a construção de um programa;

Estes oito tipos de dados são conhecidos como tipos primitivos (primitive types):

1. int
2. byte
3. short
4. long
5. float (partes fracionárias)
6. double (partes fracionárias)
7. boolean
8. char

Estes tipos não são considerados objetos, portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória (memory stack).

**Tabela de Tipos Primitivos e seus valores (capacidades)**

| Tipo | Memória | Valor mínimo | Valor máximo |
| --- | --- | --- | --- |
| byte | 1 byte | -128 | 127 |
| short | 2 byte | -32.768 | 32.767 |
| int | 4 bytes | -2.147.483.648 | 2.147.483.647 |
| float | 4 bytes | -1,4024E-37 | 3.40282347E+38 |
| char |  | 0 | 65535 |
| double | 8 bytes | -4,94E307 | 1.79769313486231570E+10B |
| long | 8 bytes | -9.223.372.036.854.770.000 | 9.223.372.036.854.770.000 |
| boolean |  | false | true |

> Por mais que a gente tenha 4 tipos númericos inteiros, é muito comum usarmos *int* nas aplicações por uma questão de compatibilidade da jvm, ela sempre busca converter tipos literais para *int*. ********Double******** também é mais comum em casos fracionários.
> 
- Declaração de Variáveis

Variável é uma identificação de um epaço em memória utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipos de dados + identificação + valor atribuído.

A estrutura padrão para se declarar uma variável sempr é:

```java
<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
```

Por padrão, variáveis de tipo numérico cujos valores não são declarados recebem o valor = 0; variáveis de tipo lógico que não recebem valor costumam ser falsas por padrão.

Obs.: a linguagem Java não reconhece o ponto (.) para declaração de variável com valor milhar. Exemplo:

```java
double salarioMinimo = 2.500; // desta forma, o valor é considerado pela linguagem como 2,5.
double salarioMinimo = 2500; // desta forma, o valor se torna dois mil e quinhentos.
double salarioMinimo = 2500.33 // se houver centavos, aí sim adiciona-se o ponto. Esta é a convenção americana.
```

Atenção:existe algumas peculiaridades ao trabalhar com alguns tipos específicos, observe:

```java
public class TipoDados {
		public static void main(String [] args) {
			byte idade = 123;
			short ano = 2021;
			int cep = 21070333; // se começar com zero, pode ser que seja necessário utilizar outro tipo, pois o Java não armazena números que começam com zero para o tipo inteiro, provavelmente teria que usar uma string.
			long cpf = 9876632197L; // se começar com zero, idem ao comentário de cima.
			float pi = 3.14F; // se não utilizar um F no final (maiúsculo ou minúsculo), vai dar erro de compilação, pois o Java vai entender como double.
			double salario = 1275.33;
		}
}
```

Observe que o tipo *long*  precisa terminar com L, o tipo float precisa terminar com F e alguns cenários do dia-a-dia podem estimular uma alteração de tipos de dados convencional.

> Muitas vezes criamos uma variável, definimos um valor correspondente, manipulamos esta variável e temos consciência de seu valor na aplicação, mas cuidado, Java é uma linguagem fortemente tipada.
> 

```java

// problema encontrado pela IDE
short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal;

/* o 'numeroNormal', por mais que agora seja 1,
 em algum momento pode se tornar superior aos 32 mil
que o tipo short comporta, por isso a linguagem não permite.

adaptação sugerida pela IDE */
short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = (short) numeroNormal;  // utilizado o recurso casting
```

**Casting:** recurso que pega um tipo mais abrangente e converte para um tipo mais específico porque é o tipo correspondente, realizando uma adaptação. Não é coerente fazer isso com frequência, mas é como se a linguagem dissesse “se você quer colocar um valor com possível precisão maior para uma precisão menor, você precisa garantir que se acontecer algo inesperado, você esteja ciente.”

- Cada tipo de dado tem uma forma de declarar/atribuir seu valor:
1. se falamos de uma String, é preciso colocar entre aspas;
2. um inteiro utiliza o valor literal numérico;
3. double e float exigem pontuação para separar o valor decimal da expressão numérica - convenção americana;
4. utilizando caractere, utilizamos aspas simples. Ele permite um único caractere;
5. o valor booleano é atribuído utilizando os valores literais false ou true.
6. classes (representam tipos de variáveis), precisa ser antecedida com a palavra-chave *new,* que deve preceder o *Nome* da classe e informar os parâmetros de inicialização, que são os construtores ().
- Quando queremos definir um valor que nunca poderá ser alterado no decorrer da aplicação:

> **Constantes** são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada *final,* seguida do tipo. Por convenção, as constantes sempre são escritas em caixa alta.
> 

```java
// Exemplo de variáveis

int numero = 5;
numero = 10;

// Exemplo de constantes

final int NUMERO = 5;
final int NUMERO2 = 10;
```

---

# Operadores

> Operadores são símbolos especiais que utilizamos para operações e expressões matemáticas. Eles possuem significado próprio para a linguagem.
> 

Pré-requisitos:

1. diretório do projeto definido;
2. integração com Github;
3. Noções em declaração de variáveis.
- A proposta dos operadores é realizar as operações de um programa com a finalidade de atingir determinado resultado.

## Operadores de atribuição

- Representados pelo símbolo de igualdade =.
- O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. Em Java, definimos um tipo, nome e opcionalmente atribuimos um valor à variável através do operador de atribuição.
- Operadores aritméticos são utilizados para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa:

adição (+)
subtração (-)
multiplicação (*)
divisão (/)
módulo (%)

Quando o operador de adição é utilizado entre variáveis do tipo string, ele realiza a concatenação de textos.

## Operadores Unários

Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar e inverter valores numéricos e booleanos.

- Operador unário de valor positivo (+):

números são positivos sem esse operador explicitamente.

- Operador unário de valor negativo (-):

nega um npumero ou expressão aritmética.

- Operador de incremento de valor (++):

inrementa valor em 1 unidade

- Operador de decremento de valor (- -):

decrementa o valor em 1 unidade.

- Operador lógico de negação (!):

nega o valor de uma expressão booleana.

```java
public static void main(String[] args) {
        int numero = 5;
        System.out.println(-numero);
        System.out.println(numero);
// Exemplo de operador unário de valor negativo.
```

O operador de negação não afetou o valor da variável principal, apenas fez efeito no momento da impressão.

- Incrementar é pegar um valor atual e aplicar uma nova atriuição desse valor, considerando que esse incremento é sempre um valor igual, de mesmo valor, exemplo de 2 em 2, 3 em 3 etc. Neste caso, temos um fluxo de repetição.

## Operadores Ternários

O operador de Condição Ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valors. Você deve pensar numa condição ternária como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrurura estará escrita numa única linha.

> É uma forma resumida para definir uma condição e escolher por um dentre dois ou mais valores.
> 

O operador ternário é representado pelos símbolos ?: utilizados na seguinte estrutura de sintaxe:

```java
<Expressão Condicional (booleana)> ? <caso condição seja true> :
<caso condição seja false>
```

Exemplos:

```java
//classe Operadores.java
int a, b;
String resultado;

a = 5;
b = 6;

//Exemplo de condicional utilizando uma estrutura if/else
if (a==b)
	resultado = "verdadeiro";
else
	resultado = "falso";
```

## Operadores Relacionais

Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, maior, menor, menor ou igual ou maior ou igual ao da direita, retornando um valor booleano como resultado.

- ‘==’ quando desejamos verificar se uma variável é igual a outra;
- ‘!=’ quando desejamos verificar se uma variável e diferente da outra;
- ‘>’ quando desejamos verificar se uma variável é maior que a outra;
- ‘<’ quando desejamos verificar se uma variável é menor que a outra;
- ‘< =’ quando desejamos verificar se uma variável é menor ou igual a outra;
- ‘> =’ quando desejamos verificar se uma variável é menor ou igual a outra.

```java
//class Operadores.java
				int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 != numero2;

        System.out.println("Número 1 é diferente do número 2? " + "Resposta: " + simNao);
```

- Com o "==" também conseguimos verificar conteúdos, mas para comparar objetos/strings, é recomendado utilizar o método 'equals' ao invés de "==” ⇒ o retorno é boolean

```java
public class OperadoresRelacionais {
    public static void main(String[] args) {
		String nomeUm = "Talita";
		String nomeDois = new String ("Talita");

		System.ou.println(nomeUm.equals(nomeDois));
}
```

## Operadores Lógicos

Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.

- && ⇒ operador lógico ‘E’
- || ⇒ operador lógico ‘OU’

Existem duas condições, e elas podem ser uma **************************************variável booleana**************************************  ou uma expressão usando os **operadores relacionais.**

```java
public class OperadoresLogicos {
    
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira");
        }

        System.out.println("Fim!");
```

# Métodos

> Todas as ações das aplicações na linguagem Java são consideradas métodos.
> 

Pontos de reflexão:

- qual a proposta/finalidade do método?
- Algum tipo de retorno é esperado após executar o método? Qual?
- será necessárop parâmetros para a execução do método? Quais?
- o método possui o risco de apresentar alguma exceção?
- qual a visibilidade do método?

Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro das nossas classes.

## Critério de nomeação de métodos

Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:

- Deve ser nomeado como verbo
- Seguir o padrão camalCases, todas as letras minpusculas com exceção da primeira letra da segunda palavra;
- Clareza e precisão na expressão e estruturação do código;
- Caso o método não retorne nenhum valor (int, long, double, objeto etc), ele será representado pela palavra-chave **********void**********.

```java
somar (int n1, int n2) {}

abrirConexao() {}

concluirProcessamento() {}

findById (int id) {}

calcularImprimir() {} // conflito de responsabilidade. Afinal a finalidade dele é calcular ou imprimir? Deve ter apenas uma finalidade/ação.
```

Não existe em Java o conceito de métodos globais. Todos os métodos devem sempre ser definidos dentro de uma classe.

```java
public class Metodos {
    public static void main(String[] args){

        public double somar (int num1, int num2){
            //LÓGICA - FINALIZADE DO MÉTODO
            return ...;
        }

        public void imprimir(String texto){
            //LÓGICA - FINALIDADE DO MÉTODO
						//AQUI NÃO PRECISA DO RETURN
						//POIS NÃO SERÁ RETORNADO NENUM RESUTADO
        }
				
					//throws Exeption: indica que o método ao ser utilizado
					//poderá gerar uma exceção
					public double dividir (int dividento, int divisor) throws Exeption{}
			    } 
}
```

- Um método que recebe muitos parâmetros normalmente deve se tornar a abstração de um objeto, criando uma classe que já traz todos as características e será necessário passar um único parâmetro.

# Exercitando

Vamos criar um exemplo de uma classe para representar uma SmarTV onde:

1. Ela tenha as características: ligada (boolean), canal (int) e volume (int);
2. Nossa TV poderá ligar e desligar e assim mudar o estado;
3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.

# Escopo

Qual é a proposta de um escopo diante do nosso engajamento com qualquer linguagem?

> Identificar a localização mais conveniente para a escrita de algoritmos necessários para o nosso programa.
> 

Há três tipos de escopo:

- Escopo de classe
- Escopo de método
- Escopo de fluxo

O escopo pode ser entendido como o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis **********************vai de acordo com o bloco onde ela foi declarada**********************.

A variável é criada no primeiro acesso à ela, se tornando inacessível após o interpretador sair do bloco de execução ao qual ela pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.

Em uma classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da classe, sendo portanto, acessíveis por todos os métodos.

Caso você declare uma variável ****************************************dentro de um método****************************************,  o escopo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.

Uma parte fundamental na elaboração de algoritmos simples ou complexos é determinar a localização do código em questão. Sem um domínio sobre escopo de códigos seu projeto tende a conter falhas estruturais e comprometer a proposta principal da aplicação.

```java
public class Conta {
// variável da classe conta
double saldo = 10.0

public void sacar (Double valor) {
//variável local do método
double novoSaldo = saldo - valor;
}

public void imprimirSaldo(){
//disponível em toda classe
System.out.println(saldo);
//somente o método sacar conhece essa variável
System.out.println(novoSaldo)
}
}
```

# Palavras Reservadas

Na linguagem Java há 52 palavras reservadas organizadas por classificação de usabilidade considerando as regras de linguagem. Todas essas palavras são classificadas em grupos e escritas com letra minúscula, sendo identificadas com uma cor especial pela maioria das IDE’s.

Palavras reservadas são identificadores de uma linguagem que já possuem uma finalidade específica, portanto não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.

## Algumas Classificações

- Controle de pacotes
    - import: importa pacotes ou classes para dentro do código;
    - package: especifica a que pacote todas as classes de um arquivo pertencem.
- Modificadores de acesso
    - public: acesso de qualquer classe;
    - private: acesso apenas dentro da classe;
    - protected: acesso por classes no mesmo pacote e subclasses.
- Tipos primitivos
    - boolean: um valor indicando verdadeiro ou falso;
    - byte: um inteiro de 8 bits (signed);
    - char: um caractere unicode (16-bit unsigned);
    - double: um número de ponto flutuante de 64 bits (signed);
    - float: um número de ponto flutuante de 32 bits (signed);
    - int: um inteiro de 32 bits (signed);
    - long: um inteiro de 64 bits (signed);
    - short: um inteiro de 32 bits (signed);
    - void: indica que o método não tem retorno de valor.
- Modificadores de classes, variáveis ou métodos
    - abstract: classe que não pode ser instanciada ou método que precisa ser implementado por uma classe não abstrata;
    - class: especifica uma classe;
    - extends: indica a superclasse que a subclasse está estendendo;
    - final: impossibilita que uma classe seja estendida, que um método seja sobescrito ou que uma variável seja reinicializada;
    - implements: indica as interfaces que uma classe irá implementar;
    - interface: especifica uma interface;
    - native: indica que um método está escrito em uma linguagem dependente de plataforma, como o C;
    - new: instancia um novo objeto, chamando seu construtor;
    - static: faz um método ou variável pertencer à classe ao invés de às instâncias ⇒ determina que não é preciso criar objetos para desfrutar de seus recursos, a própria classe provê a estrutura/recurso;
    - strictfp: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões;
    - synchronized: indica que um método só pode ser acessado por uma thread de cada vez;
    - transisent: impede a serialização de campos ⇒ podendo armazenar os objetos em disco, banco de dados, sendo a informação sempre reinicializada;
    - volatile: indica que uma variável pode ser alterada durante o uso de threads.
    
    ### Controle de fluxo dentro de um bloco de código
    
    **break:** sai do bloco de codigo em que ele está
    
    **case:** executa um bloco de código dependendo do teste do switch
    
    **continue:** pula a execução do código que viria após essa linha e vai para a próxima passagem do loop
    
    **default:** executa esse bloco de codigo caso nenhum dos teste de switch-case seja verdadeiro
    
    **do:**
     executa um bloco de código uma vez, e então realiza um teste em 
    conjunto com o while para determinar se o bloco deverá ser executado 
    novamente
    
    **else:** executa um bloco de código alternativo caso o teste if seja falso
    
    **for:** usado para realizar um loop condicional de um bloco de código
    
    **if:** usado para realizar um teste lógico de verdadeiro o falso
    
    **instanceof:** determina se um objeto é uma instância de determinada classe, superclasse ou interface
    
    **return:** retorna de um método sem executar qualquer código que venha depois desta linha (também pode retornar uma variável)
    
    **switch:** indica a variável a ser comparada nas expressões case
    
    **while:** executa um bloco de código repetidamente enquanto a condição for verdadeira
    
    ---
    
    ### Tratamento de erros
    
    ---
    
    **assert:**  testa uma expressão condicional para verificar uma suposição do programador
    
    **catch:** declara o bloco de código usado para tratar uma exceção
    
    **finally:** bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção
    
    **throw:**usado para passar uma exceção para o método que o chamou
    
    **throws:** indica que um método pode passar uma exceção para o método que o chamou
    
    **try:** bloco de código que tentará ser executado, mas que pode causar uma exceção
    
    ---
    
    ### Variáveis de referência
    
    ---
    
    **super:** refere-se a superclasse imediata
    
    **this:** refere-se a instância atual do objeto
    
    ---
    
    ### Palavras reservadas não utilizadas
    
    ---
    
    **const:** Não utilize para declarar constantes; use public static final
    
    **goto:** não implementada na linguagem Java por ser considerada prejudicial
    
    ---
    
    ### Literais reservados
    
    ---
    
    De acordo com a Java Language Specification, ,  e 
     são tecnicamente chamados de valores literais, e não keywords. Se você 
    tentar criar algum identificador com estes valores, você também terá um 
    erro de compilação.
    
    ---
    
    ### Escopo de uso
    
    | Uso | Palavras | Observação |
    | --- | --- | --- |
    | Arquivo | package, import, static |  |
    | Classe | public ou protected ou private + final ou abstract + extends ou implements | private (em caso de classe interna), final ou abstract ? |
    | Método | public ou protected ou private + static ou final ou abstract + void e return | void em caso de não ter retorno ou return se houver |
    | Atributo | public ou protected ou private + static ou final + tipo primitivo | **** |
    
    ### Palavras "opostas"
    
    Assim como nas classificações gramaticais da língua 
    portuguesa, existem algumas palavras que são completamente opostas 
    (antônimas) na linguagem Java conforme tabela abaixo:
    
    | Palavra | Palavra | Explicação |
    | --- | --- | --- |
    | package | import | Enquanto package determina o diretório real da classe, o import informe de onde será imprtada a classe. Isso porque podemos ter classes de mesmo nome. |
    | extends | implements | enquanto extends determinas que uma classe estende outra classe, implements determina que uma classe implementa uma interface, porém nunca o contrário |
    | final | abstract | enquanto final determina fim de alteração de valor ou lógica comportamental, abstract
     em métodos exige que sub-classes precisarão definir comportamento é um 
    método abstrato. NOTA: Se uma classe contém um único método abstrato, 
    toda classe precisa ser. |
    | throws | throw | Esta é uma das situações mais complicadas de compreensão destas duas palavras. Enquanto a throws determina que um método pode lançar uma exceção, throw é a implementação que dispara a exceção**. Vamos conhecer mais sobre este conceito no assunto Exceções.** |
    
    # Java Doc
    
    Uma das maiores características da linguagem Java é que desde suas primeiras versões tínhamos em nossas mãos uma documentação rica e detalhada dos recursos da linguagem.
    
    Conforme site oficial, podemos compreender e explorar todos os recursos organizados por pacotes e classes bem específicas sem nem mesmo escrever uma linha de código.
    
    ## Tags
    
    Mas e quais as informações que obtemos através de classes 
    documentadas na linguagem ? Java Documentation é composto por tags que 
    representam dados relevantes para a compreensão da proposta de uma 
    classe e os conjunto de seus métodos e atributos conforme tabela abaixo:
    
    | Tag | Descrição |
    | --- | --- |
    | @autor | Autor / Criador |
    | @version | Versão do recurso disponibilizado |
    | @since | Versão / Data de início da disponibilização do recurso |
    | @param | Descrição dos parâmetros dos métodos criados |
    | @return | Definição do tipo de retorno de um método |
    | @throws | Se o método lança alguma exceção |
    
    Exemplo de classe com documentação destacando as **tags** mais utilizadas.
 
    
    ```java
    /**
    * <h1>Calculadora</h1>
    * A Calculadora realiza operações matemáticas entre números inteiros
    * <p>
    * <b>Note:</b> Leia atentamente a documentação desta classes
    * para desfrutar dos recursos oferecidos pelo autor
    *
    * @author  Talita Rocha
    * @version 1.0
    * @since   07/03/2023
    */
    public class Calculadora {
        /**
       * Este método é utilizado para somar dois números inteiros
       * @param numeroUm este é o primeiro parâmetro do método
       * @param numeroDois este é o segundo parâmetro do método
       * @return int o resultado deste método é a soma dos dois números.
       */
        public int somar(int numeroUm, int numeroDois) {
            return  numeroUm + numeroDois;
        }
    }
        
    ### Tipos de comentários
    
    `// Olá, eu sou um comentário em uma única linha`

    
    `/* Olá,
     * Eu sou um comentario
     * que posso ser mais detalhadod
     * quando necessário
     */`

    
    `/** 
     * Estas duas estrelinhas acima
     * são para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação.
     */`

    Um comentário não possui a finalidade de **amenizar** um algoritmo não estruturado conforme as convenções da linguagem. Observe abaixo o exemplo de um código confuso e ilegível:
    
    `/*
     * Este método foi elaborado as pressas
     * por isso eu abrevei o nome das variáveis
     * mas olha, ele tem a finalidade somar ou  multiplicar
     * dois números
     * /
    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x
        }
        return r;
    }`
    
    ## Javadoc
    
    **Javadoc** é um gerador de documentação criado pela [Sun Microsystems](https://pt.wikipedia.org/wiki/Sun_Microsystems) para documentar a [API](https://pt.wikipedia.org/wiki/API) dos programas em [Java](https://pt.wikipedia.org/wiki/Linguagem_de_programa%C3%A7%C3%A3o_Java), a partir do [código-fonte](https://pt.wikipedia.org/wiki/C%C3%B3digo-fonte). O resultado é expresso em [HTML](https://pt.wikipedia.org/wiki/HTML). É constituído, basicamente, por algumas marcações muitos simples inseridas nos comentários do programa.
    
    Este sistema é o padrão de documentação de classes em Java, e muitas dos [IDEs](https://pt.wikipedia.org/wiki/Ambiente_de_desenvolvimento_integrado) desta linguagem irão automaticamente gerar um Javadoc em [HTML](https://pt.wikipedia.org/wiki/HTML).
    
    {% embed url="[https://pt.wikipedia.org/wiki/Javadoc](https://pt.wikipedia.org/wiki/Javadoc)" %}
    
    Criando nossa documentação no formato html para disponibilizar via web.
    
    `// No terminal execute o comando abaixo
    
    javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java`
    
    - Modificadores de classes, variáveis ou métodos
    - abstract: classe que não pode ser instanciada ou método que precisa ser implementado por uma classe não abstrata;
    - class: especifica uma classe;
    - extends: indica a superclasse que a subclasse está estendendo;
    - final: impossibilita que uma classe seja estendida, que um método seja sobescrito ou que uma variável seja reinicializada;
    - implements: indica as interfaces que uma classe irá implementar;
    - interface: especifica uma interface;
    - native: indica que um método está escrito em uma linguagem dependente de plataforma, como o C;
    - new: instancia um novo objeto, chamando seu construtor;
    - static: faz um método ou variável pertencer à classe ao invés de às instâncias ⇒ determina que não é preciso criar objetos para desfrutar de seus recursos, a própria classe provê a estrutura/recurso;
    - strictfp: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões;
    - synchronized: indica que um método só pode ser acessado por uma thread de cada vez;
    - transisent: impede a serialização de campos ⇒ podendo armazenar os objetos em disco, banco de dados, sendo a informação sempre reinicializada;
    - volatile: indica que uma variável pode ser alterada durante o uso de threads.
    
    ### Controle de fluxo dentro de um bloco de código
    
    **break:** sai do bloco de codigo em que ele está
    
    **case:** executa um bloco de código dependendo do teste do switch
    
    **continue:** pula a execução do código que viria após essa linha e vai para a próxima passagem do loop
    
    **default:** executa esse bloco de codigo caso nenhum dos teste de switch-case seja verdadeiro
    
    **do:**
     executa um bloco de código uma vez, e então realiza um teste em 
    conjunto com o while para determinar se o bloco deverá ser executado 
    novamente
    
    **else:** executa um bloco de código alternativo caso o teste if seja falso
    
    **for:** usado para realizar um loop condicional de um bloco de código
    
    **if:** usado para realizar um teste lógico de verdadeiro o falso
    
    **instanceof:** determina se um objeto é uma instância de determinada classe, superclasse ou interface
    
    **return:** retorna de um método sem executar qualquer código que venha depois desta linha (também pode retornar uma variável)
    
    **switch:** indica a variável a ser comparada nas expressões case
    
    **while:** executa um bloco de código repetidamente enquanto a condição for verdadeira
    
    ---
    
    ### Tratamento de erros
    
    ---
    
    **assert:**  testa uma expressão condicional para verificar uma suposição do programador
    
    **catch:** declara o bloco de código usado para tratar uma exceção
    
    **finally:** bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção
    
    **throw:**usado para passar uma exceção para o método que o chamou
    
    **throws:** indica que um método pode passar uma exceção para o método que o chamou
    
    **try:** bloco de código que tentará ser executado, mas que pode causar uma exceção
    
    ---
    
    ### Variáveis de referência
    
    ---
    
    **super:** refere-se a superclasse imediata
    
    **this:** refere-se a instância atual do objeto
    
    ---
    
    ### Palavras reservadas não utilizadas
    
    ---
    
    **const:** Não utilize para declarar constantes; use public static final
    
    **goto:** não implementada na linguagem Java por ser considerada prejudicial
    
    ---
    
    ### Literais reservados
    
    ---
    
    De acordo com a Java Language Specification, ,  e 
     são tecnicamente chamados de valores literais, e não keywords. Se você 
    tentar criar algum identificador com estes valores, você também terá um 
    erro de compilação.
    
    ---
    
    ### Escopo de uso
    
    | Uso | Palavras | Observação |
    | --- | --- | --- |
    | Arquivo | package, import, static |  |
    | Classe | public ou protected ou private + final ou abstract + extends ou implements | private (em caso de classe interna), final ou abstract ? |
    | Método | public ou protected ou private + static ou final ou abstract + void e return | void em caso de não ter retorno ou return se houver |
    | Atributo | public ou protected ou private + static ou final + tipo primitivo | **** |
    
    ### Palavras "opostas"
    
    Assim como nas classificações gramaticais da língua 
    portuguesa, existem algumas palavras que são completamente opostas 
    (antônimas) na linguagem Java conforme tabela abaixo:
    
    | Palavra | Palavra | Explicação |
    | --- | --- | --- |
    | package | import | Enquanto package determina o diretório real da classe, o import informe de onde será imprtada a classe. Isso porque podemos ter classes de mesmo nome. |
    | extends | implements | enquanto extends determinas que uma classe estende outra classe, implements determina que uma classe implementa uma interface, porém nunca o contrário |
    | final | abstract | enquanto final determina fim de alteração de valor ou lógica comportamental, abstract
     em métodos exige que sub-classes precisarão definir comportamento é um 
    método abstrato. NOTA: Se uma classe contém um único método abstrato, 
    toda classe precisa ser. |
    | throws | throw | Esta é uma das situações mais complicadas de compreensão destas duas palavras. Enquanto a throws determina que um método pode lançar uma exceção, throw é a implementação que dispara a exceção**. Vamos conhecer mais sobre este conceito no assunto Exceções.** |
    
    # Java Doc
    
    Uma das maiores características da linguagem Java é que desde suas primeiras versões tínhamos em nossas mãos uma documentação rica e detalhada dos recursos da linguagem.
    
    Conforme site oficial, podemos compreender e explorar todos os recursos organizados por pacotes e classes bem específicas sem nem mesmo escrever uma linha de código.
    
    ## Tags
    
    Mas e quais as informações que obtemos através de classes 
    documentadas na linguagem ? Java Documentation é composto por tags que 
    representam dados relevantes para a compreensão da proposta de uma 
    classe e os conjunto de seus métodos e atributos conforme tabela abaixo:
    
    | Tag | Descrição |
    | --- | --- |
    | @autor | Autor / Criador |
    | @version | Versão do recurso disponibilizado |
    | @since | Versão / Data de início da disponibilização do recurso |
    | @param | Descrição dos parâmetros dos métodos criados |
    | @return | Definição do tipo de retorno de um método |
    | @throws | Se o método lança alguma exceção |
    
    Exemplo de classe com documentação destacando as **tags** mais utilizadas.
    
    {% tabs %}
    {% tab title="Código" %}
    
    ```java
    /**
    * <h1>Calculadora</h1>
    * A Calculadora realiza operações matemáticas entre números inteiros
    * <p>
    * <b>Note:</b> Leia atentamente a documentação desta classes
    * para desfrutar dos recursos oferecidos pelo autor
    *
    * @author  Talita Rocha
    * @version 1.0
    * @since   07/03/2023
    */
    public class Calculadora {
        /**
       * Este método é utilizado para somar dois números inteiros
       * @param numeroUm este é o primeiro parâmetro do método
       * @param numeroDois este é o segundo parâmetro do método
       * @return int o resultado deste método é a soma dos dois números.
       */
        public int somar(int numeroUm, int numeroDois) {
            return  numeroUm + numeroDois;
        }
    }
    ```
    
    {% endtab %}
    
    {% tab title="Guia" %}
    
    {% endtab %}
    {% endtabs %}
    
    ![https://github.com/digitalinnovationone/trilha-java-basico/raw/main/gitbook/.gitbook/assets/image%20(15)%20(1).png](https://github.com/digitalinnovationone/trilha-java-basico/raw/main/gitbook/.gitbook/assets/image%20(15)%20(1).png)
    
    ### Tipos de comentários
    
    {% tabs %}
    {% tab title="One Line" %}
    
    `// Olá, eu sou um comentário em uma única linha`
    
    {% endtab %}
    
    {% tab title="Mult Line" %}
    
    `/* Olá,
     * Eu sou um comentario
     * que posso ser mais detalhadod
     * quando necessário
     */`
    
    {% endtab %}
    
    {% tab title="Documentation" %}
    
    `/** 
     * Estas duas estrelinhas acima
     * são para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação.
     */`
    
    {% endtab %}
    {% endtabs %}
    
    {% hint style="danger" %}
    Um comentário não possui a finalidade de **amenizar** um algoritmo não estruturado conforme as convenções da linguagem. 
    {% endhint %}
    
    `/*
     * Este método foi elaborado as pressas
     * por isso eu abrevei o nome das variáveis
     * mas olha, ele tem a finalidade somar ou  multiplicar
     * dois números
     * /
    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x
        }
        return r;
    }`
    
    ## Javadoc
    
    **Javadoc** é um gerador de documentação criado pela [Sun Microsystems](https://pt.wikipedia.org/wiki/Sun_Microsystems) para documentar a [API](https://pt.wikipedia.org/wiki/API) dos programas em [Java](https://pt.wikipedia.org/wiki/Linguagem_de_programa%C3%A7%C3%A3o_Java), a partir do [código-fonte](https://pt.wikipedia.org/wiki/C%C3%B3digo-fonte). O resultado é expresso em [HTML](https://pt.wikipedia.org/wiki/HTML). É constituído, basicamente, por algumas marcações muitos simples inseridas nos comentários do programa.
    
    Este sistema é o padrão de documentação de classes em Java, e muitas dos [IDEs](https://pt.wikipedia.org/wiki/Ambiente_de_desenvolvimento_integrado) desta linguagem irão automaticamente gerar um Javadoc em [HTML](https://pt.wikipedia.org/wiki/HTML).
    
    {% embed url="[https://pt.wikipedia.org/wiki/Javadoc](https://pt.wikipedia.org/wiki/Javadoc)" %}
    
    Criando nossa documentação no formato html para disponibilizar via web.
    
    `// No terminal execute o comando abaixo
    
    javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java`
    
    ---
    
    # Terminal e Argumentos
    
    > Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional.
    > 
    
    Vamos iniciar criando uma classe chamada MinhaClasse.java:
    
    ```java
    public class MinhaClasse {
    	public static void main(String[] args){
    		System.out.println("Oi, fui executado pelo Terminal";)
    	}
    }
    ```
    

> Observe que nosso projeto Java criado por um IDE terá uma pasta chamada ******bin******. É nessa pasta que ficarão os arquivos .class (nossos arquivos compilados), o nosso bytecode. De fato, os programas disponíveis para execução.
> 

> Mesmo usando uma IDE, é importante sempre saber identificar onde se encontram as classes do projeto.
> 

Nesse caso: ~/Documents/java/estudos/dio-trilha-java-basico/terminal-argumentos

## Passos

1. abra o MS-DOS ou o Power Shell
2. localize o diretório do projeto: /Documents/java/estudos/dio-trilha-java-basico/terminal-argumentos
3. acesse a pasta ******bin******: cd bin
4. digite o comendo ********java MinhaClasse******** (sem a extenção .class)
5. altere a mensagem de saída do programa na IDE para ver uma nova mensagem no terminal
6. após alterado, este código precisa ser compilado novamente, ou seja, é preciso executá-lo na IDE para atualizar o arquivo binário, para que ele reflita as alterações
7. para isso, apagamos a MinhaClass.class e executamos o código novamente
8. para que a classe possa ser executada, é preciso garantir que existe o arquivo .class correspondente
9. o VS Code é inteligente: toda vez que o arquivo .java for modificado, ele compila automaticamente

> Jornada: cria classe, compila, executa.
> 

## Argumentos

> Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array [] de argumentos do tipo String. Logo, podemos após a definição da classe a ser executada, informar estes parâmetros.
> 

```java
java MinhaClasse argumentoUm argumentoDois
```

Exemplo:

```java
public class AboutMe {
	public static void main(String[] args){
		//os argumentos começam com indíce 0

		String nome = args [0];
		String sobrenome = args [1];
		int idade = Integer.valueOf (args [2]);
		double altura = Double.valueOf (args [3]);
	
		System.out.println("Olá, me chamo " + nome + " " + sobrenome);
	  System.out.println("Tenho " + idade + " anos");
	  System.out.println("Minha altura é " + altura + " cm");	
	}	
}
```


```java
/*Para que não seja necessário ficar iniciando o terminal e ajustando na IDE
* com frequência, a própria IDE disponibiliza esta configuração:
* Menu > execução > adicinar ou abrir configurações >
* observe dentro da pasta .vscode o arquivo lauch.jason, ele é
* quem determina como queremos executar um conjunto de classes.
* Cada parâmetro é separado por vírgula.
*/
```

## Scanner

> Nos exemplos anteriores percebemos que podemos receber dados digitados pelo usuário do nosso sistema, porém tudo precisa estar em uma linha e também é necessário informar os valores nas posições correspondentes. Esta abordagem pode deixar margens de execução com erro no nosso programa. Para isso, com a finalidade de deixar as nossas entradas de dados mais seguras, agoras vamos receber estes dados via ****************Scanner.****************
> 

- A classe **Scanner** permite que o usuário tenha uma interação mais assertiva com o nosso programa, veja como vamos mudar o nosso programa **`AboutMe`** para deixar mais intuitivo aos usuários.

`import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
}`
