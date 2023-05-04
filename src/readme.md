### Cenário: 
Tom costuma anotar seus todos gastos diários em uma planilha excel e analisar a saúde financeira com alguns relatórios. Devido ser um trabalho manual, Tom resolve desenvolver um software.

Para cada gasto Tom registra: o tipo do gasto ( alimentação, transporte, saúde, imposto, etc), a data do gasto, o valor do gasto e a forma de pagamento ( débito, crédito, pix, cheque, etc).

No final do mês, Tom gera um relatório de todos os seus gastos agrupados pelo tipo de gasto e exibindo o quanto foi gasto em cada forma de pagamento.

Neste software, Tom decide registrar os seus ganhos mensais, será registrado o tipo de ganho ( salário, freelancer, dividendos, etc), a data  e o valor do ganho. No final do mês Tom gera um relatório com todos os ganhos do mês agrupados pelo tipo de ganho.

Por fim, Tom quer gerar um relatório com o seu saldo mensal, ou seja, com o total de gastos no mês, o total de ganhos no mês e o saldo mensal ( ganhos - gastos).



Gasto	Tipo	Data	Valor	Forma de Pagamento
Celesc	Habitação	15/01/2023	R$ 75,00	Boleto
Água	Habitação	15/01/2023	R$ 89,56	Boleto
Cinema	Entretenimento	18/01/2023	R$ 60,00	Débito
Mercado	Alimentação	10/01/2023	R$ 560,45	Crédito
Gasolina	Transporte	14/01/2023	R$ 100,00	Pix


Ganhos	Tipo	Data	Valor	 
Salário	Salário	06/01/2023	R$ 2.500,00	 
Cliente ABC	Freelancer	10/01/2023	R$ 500,00	 
Cliente XYZ	Freelancer	12/01/2023	R$ 300,00	 
B3	Dividendos	10/01/2023	R$ 145,00


Atividade:

1. Identifique os atributos, métodos e classes deste cenário e desenvolva o diagrama de classes UML

2. Desenvolva um software funcional com a linguagem Java a partir da modelagem desenvolvida.



Exemplo:

Gestão Financeira
-----------------------
1 - Adicionar Gasto
2 - Adicionar Ganho
3 - Relatório de Gastos
4 - Relatório de Ganhos
5 - Relatório Mensal
6 - Sair

Selecione uma opção

Adicionar Gasto
-----------------------
1 - Habitação
2 - Entretenimento
3 - Alimentação
4 - Transporte
X - SEU GASTO
99 - Voltar

Selecione o tipo de gasto

Adicionar Gasto
-----------------------
Informe a data:
Informe o valor:
1 - Cheque
2 - Pix
3 - Débito

Selecione a forma de pagamento


Relatório Mensal
-----------------------
Selecione o mês:
Selecione o ano:

Relatório Mensal
-----------------------
Fevereiro de 2023
Ganho Total : R$ 7,000.99
Gasto total : R$10,000.99
Saldo: - R$ 3,000.00


Observações:

Armazene os objetos em um vetor
Não é necessário ter a opção de deletar gasto/ganho
Não é necessário cadastrar os tipos de gasto/ganho. Assume que estes objetos já estão cadastrados.
Bônus extra na nota para que apresentar o software funcionando.