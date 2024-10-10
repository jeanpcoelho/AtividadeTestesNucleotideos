# AtividadeTestesNucleotideos

OBS: Em desenvolvimento, incompleto 


IDE : Visual Studio Code

JUnit: JUnit 5 

Esta atividade consiste na configuração do ambiente e implementação de uma classe de testes, com os respectivos casos de teste, usando JUnit e TDD (test-driven development).

 Descrição da atividade:

 O código a ser desenvolvido e  testado é o de um método chamado calculaNucleotideos, que lê uma sequência de DNA de um arquivo texto e calcula o número de nucleotídeos do tipo A, C, G e T presentes na sequência. As seguintes orientações devem ser seguidas no desenvolvimento da atividade:


O método calculaNucleotideos recebe como parâmetro o caminho (string) do arquivo txt que contém a sequência. Cada arquivo texto deve conter apenas uma sequência.


O método deve retornar um array de inteiros com cinco posições, contendo, respectivamente, o número de A, C, G e T, e a última posição contendo o número de erros encontrados. A presença de qualquer outro caractere que não seja  A, C, G ou T é considerada um erro.


Utilize inicializadores de classe para gerar os arquivos de teste, um arquivo para cada caso de teste.


Utilize métodos finalizadores para excluir os arquivos texto criados durante a inicialização.


Dentro de cada método de teste, inclua uma anotação do tipo @DisplayName que identifique qual foi a lógica usada para montagem do caso de teste. Ex: “Verifica se o valor retornado é null quando o número de caracteres inválidos for superior a 10% do tamanho da sequência.”


Exemplos de sequência válida com os resultados esperados: "AAAGTCTGAC” → [4, 2, 2, 2, 0]; “AACTGTCGBA” → [3, 2, 2, 2, 1]


Uma sequência é considerada inválida se o número de caracteres inválidos for superior a 10% do tamanho da sequência. Nesses casos, o valor retornado deve ser null. Exemplo: “ABC TEM FALHA” → null. Lembrando que espaços no meio da sequência também contam como inválidos.

Caso o arquivo texto passado como parâmetro não seja encontrado, uma exceção deverá ser lançada com a mensagem de erro apropriada. Certifique-se de ter pelo menos um caso de teste para esta situação.




