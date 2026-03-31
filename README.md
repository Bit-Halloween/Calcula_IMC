# Calculadora de IMC - Atitus Educação

👥 Integrantes

* Diego Meira           - 1109435
* Eduardo Barreda Mello - 1138704
-------------------------------

## 📋 Descrição do Projeto

Programa desenvolvido em **Java** que calcula o **Índice de Massa Corporal (IMC)** e realiza a classificação conforme a tabela específica definida pela atividade.

O sistema recebe os dados do usuário via teclado e utiliza as estruturas condicionais **obrigatórias**:
- `switch` para verificar o gênero (`M`, `F` ou `N`)
- `if` dentro de cada caso do `switch` para fazer a classificação do IMC

## ✅ Funcionalidades

- Leitura de **Nome**, **Gênero** (char), **Altura** (m) e **Peso** (kg)
- Cálculo do IMC: `IMC = Peso / (Altura²)`
- Classificação conforme a tabela:
  - Masculino e Feminino possuem faixas diferentes
  - Gênero `'N'` (não informar) utiliza a tabela Feminino
- Exibição formatada do resultado

📅 Disciplina
Programação Orientada a Objetos / Lógica de Programação
Atitus Educação

⚠️ Observações Importantes
A tabela fornecida é apenas para fins de estudo e não possui validação científica
