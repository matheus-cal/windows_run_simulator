# windows_run_simulator
*ISO100 - EX3*

Utilizando o Framework Window Builder, foi criado um projeto Java que simula o Executar (Run) do Windows.

No package view, foi criado, com auxílio do framework, uma tela com um JTextField e 3 botões (OK, Cancelar e Procurar).

No package controller, devemos ter :
- Uma classe que receba o JTextField pelo construtor, implementa um ActionListener para executar a ação do botão Procurar. No método ActionPerformed, deve ter uma busca de arquivos executáveis Windows, via JFileChooser, e seleciona o arquivo a ser executado e escreve seu caminho completo no JTextField.
- Uma classe que receba o JTextField e o próprio JFrame da tela pelo construtor, implementa um ActionListener para executar a ação do botão OK. No método ActionPerformed, deve tentar executar o que está escrito no JTextField (O usuário pode digitar o caminho por conta própria, ao invés de procurar). Caso o arquivo seja inválido, dar uma mensagem de erro. Uma vez executado, sem erro, a tela é finalizada pelo método dispose().
- Uma classe que receba o próprio JFrame da tela pelo construtor, implementa um ActionListener para executar a ação do botão Cancelar. O método actionPerformed deve proceder um dispose() da tela.
