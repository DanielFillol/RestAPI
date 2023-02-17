# RestAPI

API build for FIAP fase 3.


## Database Scripts to test the API

- Crate database

``` 

CREATE DATABASE `JurisDatabase` /*!40100 DEFAULT CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

``` 

- Create table

``` 
CREATE TABLE `jurisprudences` (
  `id_juris` int NOT NULL AUTO_INCREMENT,
  `lawsuit_number` varchar(25) COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `lawsuit_class` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `lawsuit_judge` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `lawsuit_city` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `lawsuit_city_jurisdiction` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `trial_date` varchar(45) COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `publication_date` varchar(45) COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `secrecy` varchar(45) COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `lawsuit_court` varchar(45) COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `lawsuit_link_pdf_decision` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `decision_complete` text COLLATE utf8mb3_unicode_ci,
  `decision_short` text COLLATE utf8mb3_unicode_ci,
  `lawsuit_court_jurisdiction` varchar(45) COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `juris_type` varchar(45) COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id_juris`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;

``` 

Inserts

``` 
INSERT INTO jurisprudences(lawsuit_number,lawsuit_class,lawsuit_judge,lawsuit_city,lawsuit_city_jurisdiction,trial_date,publication_date,secrecy,lawsuit_court,lawsuit_link_pdf_decision,decision_complete,decision_short,lawsuit_court_jurisdiction,juris_type)
VALUES ('0000004-39.1987.8.26.0472','Embargos de Declaração Cível / Desapropriação Indireta','Aroldo Viotti','Porto Ferreira','11ª Câmara de Direito Público','01-10-2021','01-10-2021','','TJSP','https://esaj.tjsp.jus.br/cjsg/getArquivo.do?cdAcordao=15074747&cdForo=0','Recurso. Ação de Indenização por Apossamento Administrativo (Desapropriação Indireta) movida contra o DER, em fase de execução. Débito atingido pela moratória constitucional do artigo 78 do Ato das Disposições Constitucionais Transitórias. Sentença que julgou extinta a execução (art. 924, inc. II, CPC). Débito atingido pela moratória constitucional do artigo 78 do Ato das Disposições Constitucionais Transitórias. Hipótese em que deve prevalecer o quanto determinado no título sob execução. Inviabilidade, ademais, de aplicação do artigo 5º da Lei Federal nº 11.960/09, declarado inconstitucional \"por arrastamento\" pelo STF. Ademais, se é aplicável o artigo 78 do ADCT à espécie, isto se dá porque o pagamento, \"ipso facto\", não ocorreu no prazo contemplado na parte permanente da Constituição, de modo que devem ser computados juros moratórios sobre as parcelas devidas. Ademais, o STF, na apreciação de medida cautelar nas ADIs 2356 e 2362, suspendeu a eficácia do art. 2º da EC 30/00. Inaplicabilidade à espécie da Súmula Vinculante nº 17 do STF. Não há, ademais, na espécie, título judicial a amparar a pretendida execução contra os autores, ora exequentes. Princípios da economia e da celeridade processuais ininvocáveis diante da regra do art. 783 do CPC. Eventual saldo credor em favor do executado-apelante deverá ser apurado em ação própria. Recurso Extraordinário da Autarquia. Autos restituídos à Câmara pela Egrégia Presidência da Seção de Direito Público, para os fins do artigo 1.040, II, do CPC. Matéria objeto de repercussão geral nos autos do Recurso Extraordinário nº 590.751 (Tema nº 132) e Recurso Extraodinário 1.169.289/SC (Tema 1.037). Hipótese em que o Acórdão recorrido não discrepou do entendimento exarado pelo Supremo Tribunal Federal. Restituição dos autos à Colenda Presidência da Seção de Direito Público deste Tribunal de Justiça, por não se tratar de caso de possível retratação nos termos e para os fins do artigo 1.040, inciso II, do CPC.  (TJSP;  Embargos de Declaração Cível ; Relator (a): Aroldo Viotti; Órgão Julgador: 11ª Câmara de Direito Público; Foro de Porto Ferreira - 1ª Vara; Data do Julgamento: 01/10/2021; Data de Registro: 01/10/2021)','Recurso. Ação de Indenização por Apossamento Administrativo (Desapropriação Indireta) movida contra o DER, em fase de execução. Débito atingido pela moratória constitucional do artigo 78 do Ato das Disposições Constitucionais Transitórias. Sentença que julgou extinta a execução (art. 924, inc. II, CPC). Débito atingido pela moratória constitucional do artigo 78 do Ato das Disposições Constitucionais Transitórias. Hipótese em que deve prevalecer o quanto determinado no título sob execução. Inviabilidade, ademais, de aplicação do artigo 5º da Lei Federal nº 11.960/09, declarado inconstitucional \"por arrastamento\" pelo STF. Ademais, se é aplicável o artigo 78 do ADCT à espécie, isto se dá porque o pagamento, \"ipso facto\", não ocorreu no prazo contemplado na parte permanente da Constituição, de modo que devem ser computados juros moratórios sobre as parcelas devidas. Ademais, o STF, na apreciação de medida cautelar nas ADIs 2356 e 2362, suspendeu a eficácia do art. 2º da EC 30/00. Inaplicabilidade à espécie da Súmula Vinculante nº 17 do STF. Não há, ademais, na espécie, título judicial a amparar a pretendida execução contra os autores, ora exequentes. Princípios da economia e da celeridade processuais ininvocáveis diante da regra do art. 783 do CPC. Eventual saldo credor em favor do executado-apelante deverá ser apurado em ação própria. Recurso Extraordinário da Autarquia. Autos restituídos à Câmara pela Egrégia Presidência da Seção de Direito Público, para os fins do artigo 1.040, II, do CPC. Matéria objeto de repercussão geral nos autos do Recurso Extraordinário nº 590.751 (Tema nº 132) e Recurso Extraodinário 1.169.289/SC (Tema 1.037). Hipótese em que o Acórdão recorrido não discrepou do entendimento exarado pelo Supremo Tribunal Federal. Restituição dos autos à Colenda Presidência da Seção de Direito Público deste Tribunal de Justiça, por não se tratar de caso de possível retratação nos termos e para os fins do artigo 1.040, inciso II, do CPC.','2° grau','Ácordão');

INSERT INTO jurisprudences(lawsuit_number,lawsuit_class,lawsuit_judge,lawsuit_city,lawsuit_city_jurisdiction,trial_date,publication_date,secrecy,lawsuit_court,lawsuit_link_pdf_decision,decision_complete,decision_short,lawsuit_court_jurisdiction,juris_type)
VALUES('0000016-12.2012.8.26.0073',' Embargos de Declaração Criminal / Crimes contra a Flora',' Laerte Marrone',' Avaré','14ª Câmara de Direito Criminal','28-09-2021','28-09-2021','TJSP','','https://esaj.tjsp.jus.br/cjsg/getArquivo.do?cdAcordao=15056952&cdForo=0','Embargos de declaração. Alegação de erro material, omissão e contradição. 1. Erro material configurado na parte inicial do voto: correção determinada. 2. Ausência de contradição ou omissão no julgado. Irresignação que externa simples inconformismo com o mérito da decisão hostilizada, para o qual os embargos de declaração não são instrumento processual adequado, porquanto não se admite, nesta via, uma nova valoração da causa. Embargos acolhidos em parte.   (TJSP;  Embargos de Declaração Criminal ; Relator (a): Laerte Marrone; Órgão Julgador: 14ª Câmara de Direito Criminal; Foro de Avaré - 2ª Vara Criminal; Data do Julgamento: 28/09/2021; Data de Registro: 28/09/2021)',' Embargos de declaração. Alegação de erro material, omissão e contradição. 1. Erro material configurado na parte inicial do voto: correção determinada. 2. Ausência de contradição ou omissão no julgado. Irresignação que externa simples inconformismo com o mérito da decisão hostilizada, para o qual os embargos de declaração não são instrumento processual adequado, porquanto não se admite, nesta via, uma nova valoração da causa. Embargos acolhidos em parte.','2° grau','Ácordão');

INSERT INTO jurisprudences(lawsuit_number,lawsuit_class,lawsuit_judge,lawsuit_city,lawsuit_city_jurisdiction,trial_date,publication_date,secrecy,lawsuit_court,lawsuit_link_pdf_decision,decision_complete,decision_short,lawsuit_court_jurisdiction,juris_type)
VALUES('0000010-27.1978.8.26.0451',' Apelação Cível / Desapropriação Indireta',' Flora Maria Nesi Tossi Silva',' Piracicaba','13ª Câmara de Direito Público','24-09-2021','24-09-2021','','TJSP','https://esaj.tjsp.jus.br/cjsg/getArquivo.do?cdAcordao=15045101&cdForo=0','EXPEDIENTE DA PRESIDÊNCIA DA SEÇÃO DE DIREITO PÚBLICO. DESAPROPRIAÇÃO INDIRETA, movida em 1978, EM FASE DE EXECUÇÃO. V. acórdãos (da fase de cumprimento de sentença), proferidos em 07.11.2012 e 30.01.2013.Devolução dos autos à Turma Julgadora pela E. Presidência da Seção de Direito Público deste Tribunal de Justiça para eventual adequação da fundamentação e/ou manutenção da decisão (art. 1.040, inciso II, do CPC/2015).Desnecessidade de adequação dos v. acórdãos proferidos por esta C. 13ª Câmara de Direito Público. Inaplicabilidade dos temas 810 do STF e 905 do STJ ao caso quanto aos juros, considerando que se trata de ação de desapropriação indireta, que apresenta regramento próprio sobre os juros.No tocante à correção monetária, observo que o título exequendo é oriundo de ação ajuizada no ano de 1978, com fixação de correção monetária e juros de mora vigentes àquela época. Precatório pago em 08 parcelas, tendo sido o último depósito realizado no ano de 2011. A aplicação da Lei 11.960/09 a partir de sua vigência dar-se-ia com desprezo das peculiaridades do caso concreto, revelando ofensa à coisa julgada e ao princípio da segurança e certeza das relações jurídicas.V. ACÓRDÃOS RATIFICADOS, CONSIDERANDO A SITUAÇÃO PECULIAR DO CASO CONCRETO.   (TJSP;  Apelação Cível ; Relator (a): Flora Maria Nesi Tossi Silva; Órgão Julgador: 13ª Câmara de Direito Público; Foro de Piracicaba - 1ª Vara da Fazenda Pública; Data do Julgamento: 24/09/2021; Data de Registro: 24/09/2021)',' EXPEDIENTE DA PRESIDÊNCIA DA SEÇÃO DE DIREITO PÚBLICO. DESAPROPRIAÇÃO INDIRETA, movida em 1978, EM FASE DE EXECUÇÃO. V. acórdãos (da fase de cumprimento de sentença), proferidos em 07.11.2012 e 30.01.2013.Devolução dos autos à Turma Julgadora pela E. Presidência da Seção de Direito Público deste Tribunal de Justiça para eventual adequação da fundamentação e/ou manutenção da decisão (art. 1.040, inciso II, do CPC/2015).Desnecessidade de adequação dos v. acórdãos proferidos por esta C. 13ª Câmara de Direito Público. Inaplicabilidade dos temas 810 do STF e 905 do STJ ao caso quanto aos juros, considerando que se trata de ação de desapropriação indireta, que apresenta regramento próprio sobre os juros.No tocante à correção monetária, observo que o título exequendo é oriundo de ação ajuizada no ano de 1978, com fixação de correção monetária e juros de mora vigentes àquela época. Precatório pago em 08 parcelas, tendo sido o último depósito realizado no ano de 2011. A aplicação da Lei 11.960/09 a partir de sua vigência dar-se-ia com desprezo das peculiaridades do caso concreto, revelando ofensa à coisa julgada e ao princípio da segurança e certeza das relações jurídicas.V. ACÓRDÃOS RATIFICADOS, CONSIDERANDO A SITUAÇÃO PECULIAR DO CASO CONCRETO.  ','2° grau','Ácordão');

INSERT INTO jurisprudences(lawsuit_number,lawsuit_class,lawsuit_judge,lawsuit_city,lawsuit_city_jurisdiction,trial_date,publication_date,secrecy,lawsuit_court,lawsuit_link_pdf_decision,decision_complete,decision_short,lawsuit_court_jurisdiction,juris_type)
VALUES('0000009-75.2017.8.26.0095',' Apelação Criminal / Desacato',' Grassi Neto',' Brotas','9ª Câmara de Direito Criminal','29-09-2021','29-09-2021','','TJSP','https://esaj.tjsp.jus.br/cjsg/getArquivo.do?cdAcordao=15064530&cdForo=0','Resistência e desacato - Conjunto probatório desfavorável ao réu lastrado em depoimentos coerentes e harmônicos das vítimas policiais – Suficiência à aferição da realização dos tipos penais, da autoria e do doloA jurisprudência tem se inclinado no sentido de que, não havendo fundado motivo que recomende seja a palavra do policial considerada com reservas, suas declarações deverão revestir-se de presunção de veracidade e de legitimidade, que é inerente aos atos administrativos em geral, tendo especial importância, tanto para confirmar os fatos, quanto sua autoria e dolo, referentes a abordagem, da qual resultou prisão do agente por resistência e desacato, ao   opor-se à execução de ato legal, mediante violência ou ameaça a funcionário competente para executá-lo ou a quem lhe esteja prestando auxílio, bem como ao preferir expressão que visava a humilhar funcionário público no exercício de suas funções.  (TJSP;  Apelação Criminal ; Relator (a): Grassi Neto; Órgão Julgador: 9ª Câmara de Direito Criminal; Foro de Brotas - 1ª Vara; Data do Julgamento: 29/09/2021; Data de Registro: 29/09/2021)',' Resistência e desacato - Conjunto probatório desfavorável ao réu lastrado em depoimentos coerentes e harmônicos das vítimas policiais – Suficiência à aferição da realização dos tipos penais, da autoria e do doloA jurisprudência tem se inclinado no sentido de que, não havendo fundado motivo que recomende seja a palavra do policial considerada com reservas, suas declarações deverão revestir-se de presunção de veracidade e de legitimidade, que é inerente aos atos administrativos em geral, tendo especial importância, tanto para confirmar os fatos, quanto sua autoria e dolo, referentes a abordagem, da qual resultou prisão do agente por resistência e desacato, ao   opor-se à execução de ato legal, mediante violência ou ameaça a funcionário competente para executá-lo ou a quem lhe esteja prestando auxílio, bem como ao preferir expressão que visava a humilhar funcionário público no exercício de suas funções. ','2° grau','Ácordão');

INSERT INTO jurisprudences(lawsuit_number,lawsuit_class,lawsuit_judge,lawsuit_city,lawsuit_city_jurisdiction,trial_date,publication_date,secrecy,lawsuit_court,lawsuit_link_pdf_decision,decision_complete,decision_short,lawsuit_court_jurisdiction,juris_type)
VALUES('0000019-96.2017.8.26.0038',' Apelação Criminal / Receptação',' Camargo Aranha Filho',' Araras','16ª Câmara de Direito Criminal','04-10-2021','04-10-2021','','TJSP','https://esaj.tjsp.jus.br/cjsg/getArquivo.do?cdAcordao=15078421&cdForo=0','APELAÇÃO. RECEPTAÇÃO DOLOSA. Artigo 180, caput, do Código Penal. Sentença condenatória. Pleito de reforma da r. sentença. Alegação de fragilidade da prova. Irresignação não acolhida. Materialidade e autoria comprovadas pelo conjunto probatório. Declarações da vítima. Em ilícitos patrimoniais, a palavra da vítima é de suma valia. Testemunhos de agentes policiais. Inquestionável eficácia probatória especialmente quando prestado em juízo, sob a garantia do contraditório. Circunstâncias da investidura na posse da coisa que revela a ciência da origem espúria do bem. Condenação mantida. Dosimetria da pena que, entretanto, comporta reparo. Inquéritos policiais ou ações penais em curso não se prestam para a valoração das circunstâncias judiciais em desfavor do réu, sendo indispensável a certidão indicando condenação com trânsito em julgado. Súmula n. 444, do Colendo Superior Tribunal de Justiça. Pena-base reduzida ao mínimo legal. Regime inicial de cumprimento abrandado para o aberto. Substituição da pena privativa de liberdade por restritivas de direitos. Sentença reformada em parte. RECURSO PARCIALMENTE PROVIDO.  (TJSP;  Apelação Criminal ; Relator (a): Camargo Aranha Filho; Órgão Julgador: 16ª Câmara de Direito Criminal; Foro de Araras - Vara Criminal; Data do Julgamento: 04/10/2021; Data de Registro: 04/10/2021)',' APELAÇÃO. RECEPTAÇÃO DOLOSA. Artigo 180, caput, do Código Penal. Sentença condenatória. Pleito de reforma da r. sentença. Alegação de fragilidade da prova. Irresignação não acolhida. Materialidade e autoria comprovadas pelo conjunto probatório. Declarações da vítima. Em ilícitos patrimoniais, a palavra da vítima é de suma valia. Testemunhos de agentes policiais. Inquestionável eficácia probatória especialmente quando prestado em juízo, sob a garantia do contraditório. Circunstâncias da investidura na posse da coisa que revela a ciência da origem espúria do bem. Condenação mantida. Dosimetria da pena que, entretanto, comporta reparo. Inquéritos policiais ou ações penais em curso não se prestam para a valoração das circunstâncias judiciais em desfavor do réu, sendo indispensável a certidão indicando condenação com trânsito em julgado. Súmula n. 444, do Colendo Superior Tribunal de Justiça. Pena-base reduzida ao mínimo legal. Regime inicial de cumprimento abrandado para o aberto. Substituição da pena privativa de liberdade por restritivas de direitos. Sentença reformada em parte. RECURSO PARCIALMENTE PROVIDO. ','2° grau','Ácordão');

INSERT INTO jurisprudences(lawsuit_number,lawsuit_class,lawsuit_judge,lawsuit_city,lawsuit_city_jurisdiction,trial_date,publication_date,secrecy,lawsuit_court,lawsuit_link_pdf_decision,decision_complete,decision_short,lawsuit_court_jurisdiction,juris_type)
VALUES('0000040-59.1981.8.26.0224',' Apelação Cível / Desapropriação por Utilidade Pública / DL 3.365/1941',' Oswaldo Luiz Palu',' Guarulhos','9ª Câmara de Direito Público','24-09-2021','24-09-2021','','TJSP','https://esaj.tjsp.jus.br/cjsg/getArquivo.do?cdAcordao=15045950&cdForo=0','RETRATAÇÃO. Desapropriação. Embargos à Execução. Impugnação aos cálculos. Pagamento integral do crédito. Não incidência da Lei nº 11.960/09.1. Colendo STF que julgou em 20.09.2017 o Tema 810 (RE 870.947/SE), que trata da validade da correção monetária e dos juros moratórios incidentes sobre as condenações impostas à Fazenda Pública. No tocante às relações jurídicas não tributárias, o entendimento é claro quanto à constitucionalidade dos juros moratórios da caderneta de poupança, nos termos da Lei nº 11.960/09, e quanto à inconstitucionalidade dos índices de correção monetária da caderneta de poupança, com aplicação do índice IPCA-E.2. Crédito oriundo de ação de desapropriação, regulada por lei específica, tanto no que concerne ao pedido principal quanto a seus consectários legais, e que não admite o regramento dado pela Lei 9.494/97, seja em sua redação original, seja pela redação dada pela Lei nº 11.960/2009, em estrita consonância com o entendimento proferido pelo C. Superior Tribunal de Justiça em repercussão geral nos autos do REsp nº 1.495.146/MG, Tema 905, DJe 02/03/2018, que assim dispõe: \"(...) 3.1.2. Condenações judiciais referentes a desapropriações diretas e indiretas. No âmbito das condenações judiciais referentes a desapropriações diretas e indiretas existem regras específicas, no que concerne aos juros moratórios e compensatórios, razão pela qual não se justifica a incidência do art. 1º-F da Lei 9.494/97 (com redação dada pela Lei nº 11.960/2009), nem para compensação da mora nem para remuneração do capital. (...)\" 3. Acórdão mantido. Retratação não realizada.  (TJSP;  Apelação Cível ; Relator (a): Oswaldo Luiz Palu; Órgão Julgador: 9ª Câmara de Direito Público; Foro de Guarulhos - 4ª. Vara Cível; Data do Julgamento: 24/09/2021; Data de Registro: 24/09/2021)',' RETRATAÇÃO. Desapropriação. Embargos à Execução. Impugnação aos cálculos. Pagamento integral do crédito. Não incidência da Lei nº 11.960/09.1. Colendo STF que julgou em 20.09.2017 o Tema 810 (RE 870.947/SE), que trata da validade da correção monetária e dos juros moratórios incidentes sobre as condenações impostas à Fazenda Pública. No tocante às relações jurídicas não tributárias, o entendimento é claro quanto à constitucionalidade dos juros moratórios da caderneta de poupança, nos termos da Lei nº 11.960/09, e quanto à inconstitucionalidade dos índices de correção monetária da caderneta de poupança, com aplicação do índice IPCA-E.2. Crédito oriundo de ação de desapropriação, regulada por lei específica, tanto no que concerne ao pedido principal quanto a seus consectários legais, e que não admite o regramento dado pela Lei 9.494/97, seja em sua redação original, seja pela redação dada pela Lei nº 11.960/2009, em estrita consonância com o entendimento proferido pelo C. Superior Tribunal de Justiça em repercussão geral nos autos do REsp nº 1.495.146/MG, Tema 905, DJe 02/03/2018, que assim dispõe: \"(...) 3.1.2. Condenações judiciais referentes a desapropriações diretas e indiretas. No âmbito das condenações judiciais referentes a desapropriações diretas e indiretas existem regras específicas, no que concerne aos juros moratórios e compensatórios, razão pela qual não se justifica a incidência do art. 1º-F da Lei 9.494/97 (com redação dada pela Lei nº 11.960/2009), nem para compensação da mora nem para remuneração do capital. (...)\" 3. Acórdão mantido. Retratação não realizada. ','2° grau','Ácordão');

INSERT INTO jurisprudences(lawsuit_number,lawsuit_class,lawsuit_judge,lawsuit_city,lawsuit_city_jurisdiction,trial_date,publication_date,secrecy,lawsuit_court,lawsuit_link_pdf_decision,decision_complete,decision_short,lawsuit_court_jurisdiction,juris_type)
VALUES('0000047-38.1998.8.26.0456',' Apelação Criminal / Estelionato',' Grassi Neto',' Pirapozinho','9ª Câmara de Direito Criminal','30-09-2021','30-09-2021','','TJSP','https://esaj.tjsp.jus.br/cjsg/getArquivo.do?cdAcordao=15072048&cdForo=0','Extinção da punibilidade –  Fatos ocorridos antes da entrada em vigor da Lei n. 12.234/10 –  Sentença condenatória com trânsito em julgado apenas para a acusação –  Fluência, entre a data de publicação da sentença recorrida e o julgamento do recurso, de lapso de tempo superior ao prazo prescricional obtido a partir do quantum de pena aplicado, dentre os previstos no rol do art. 109 do CP –  Ocorrência da prescrição intercorrente da pretensão punitiva nos termos do art. 110, § 1º, do CPEm se cuidando de sentença condenatória com trânsito em julgado apenas para acusação, na hipótese de, entre a data da publicação da sentença condenatória e a do presente julgamento, ter restado superado o lapso prescricional obtido a partir do quantum de pena aplicado, dentre aqueles previstos no rol do art. 109 do CP, torna-se de rigor a decretação da extinção da punibilidade do réu, nos termos do art. 110, § 1º, do CP, pelo advento da prescrição intercorrente da pretensão punitiva.  (TJSP;  Apelação Criminal ; Relator (a): Grassi Neto; Órgão Julgador: 9ª Câmara de Direito Criminal; Foro de Pirapozinho - 1ª Vara Judicial; Data do Julgamento: 30/09/2021; Data de Registro: 30/09/2021)',' Extinção da punibilidade –  Fatos ocorridos antes da entrada em vigor da Lei n. 12.234/10 –  Sentença condenatória com trânsito em julgado apenas para a acusação –  Fluência, entre a data de publicação da sentença recorrida e o julgamento do recurso, de lapso de tempo superior ao prazo prescricional obtido a partir do quantum de pena aplicado, dentre os previstos no rol do art. 109 do CP –  Ocorrência da prescrição intercorrente da pretensão punitiva nos termos do art. 110, § 1º, do CPEm se cuidando de sentença condenatória com trânsito em julgado apenas para acusação, na hipótese de, entre a data da publicação da sentença condenatória e a do presente julgamento, ter restado superado o lapso prescricional obtido a partir do quantum de pena aplicado, dentre aqueles previstos no rol do art. 109 do CP, torna-se de rigor a decretação da extinção da punibilidade do réu, nos termos do art. 110, § 1º, do CP, pelo advento da prescrição intercorrente da pretensão punitiva. ','2° grau','Ácordão');

INSERT INTO jurisprudences(lawsuit_number,lawsuit_class,lawsuit_judge,lawsuit_city,lawsuit_city_jurisdiction,trial_date,publication_date,secrecy,lawsuit_court,lawsuit_link_pdf_decision,decision_complete,decision_short,lawsuit_court_jurisdiction,juris_type)
VALUES('0000054-53.2018.8.26.0545',' Apelação Criminal / Furto Qualificado',' Gilda  Alves Barbosa  Diodatti',' Piracaia','15ª Câmara de Direito Criminal','29-09-2021','29-09-2021','','TJSP','https://esaj.tjsp.jus.br/cjsg/getArquivo.do?cdAcordao=15064653&cdForo=0','PRESCRIÇÃO DA PRETENSÃO PUNITIVA RETROATIVA. DECLARAÇÃO IMPERATIVA. O apelante Brendo foi condenado pela prática dos crimes de violação de domicílio e furto tentado qualificado, respectivamente, às penas de seis meses de detenção, e de oito meses de reclusão e três dias-multa, cujo lapso prescricional é de três anos, reduzido pela metade em razão da menoridade relativa dele à época dos fatos. Ocorre que, entre a data do recebimento da denúncia (22/05/2018) e o dia em que a sentença condenatória tornou-se pública (19/07/2021), transcorreu tal lapso temporal, ausentes causas interruptivas ou suspensivas da prescrição. Nesse cenário, forçosa é a declaração de extinção da punibilidade do acusado, pela prescrição da pretensão punitiva, retroativa. Declarada extinta a punibilidade de Brendo Luciano Cruz Silva, pela prescrição da pretensão punitiva, retroativa.  (TJSP;  Apelação Criminal ; Relator (a): Gilda  Alves Barbosa  Diodatti; Órgão Julgador: 15ª Câmara de Direito Criminal; Foro de Piracaia - 1ª Vara; Data do Julgamento: 29/09/2021; Data de Registro: 29/09/2021)',' PRESCRIÇÃO DA PRETENSÃO PUNITIVA RETROATIVA. DECLARAÇÃO IMPERATIVA. O apelante Brendo foi condenado pela prática dos crimes de violação de domicílio e furto tentado qualificado, respectivamente, às penas de seis meses de detenção, e de oito meses de reclusão e três dias-multa, cujo lapso prescricional é de três anos, reduzido pela metade em razão da menoridade relativa dele à época dos fatos. Ocorre que, entre a data do recebimento da denúncia (22/05/2018) e o dia em que a sentença condenatória tornou-se pública (19/07/2021), transcorreu tal lapso temporal, ausentes causas interruptivas ou suspensivas da prescrição. Nesse cenário, forçosa é a declaração de extinção da punibilidade do acusado, pela prescrição da pretensão punitiva, retroativa. Declarada extinta a punibilidade de Brendo Luciano Cruz Silva, pela prescrição da pretensão punitiva, retroativa. ','2° grau','Ácordão');

INSERT INTO jurisprudences(lawsuit_number,lawsuit_class,lawsuit_judge,lawsuit_city,lawsuit_city_jurisdiction,trial_date,publication_date,secrecy,lawsuit_court,lawsuit_link_pdf_decision,decision_complete,decision_short,lawsuit_court_jurisdiction,juris_type)
VALUES('0000058-92.2010.8.26.0053',' Apelação Cível / Pagamento Atrasado / Correção Monetária',' Rubens Rihl',' São Paulo','1ª Câmara de Direito Público','04-10-2021','04-10-2021','','TJSP','https://esaj.tjsp.jus.br/cjsg/getArquivo.do?cdAcordao=15079959&cdForo=0','JUÍZO DE RETRATAÇÃO –  Artigo 1.030, inciso II, do Código de Processo Civil - Correção Monetária e Juros de Mora - Julgamento do 1.495.146/MG, Tema 905, pelo STJ - Adoção do critério pacificado tanto pelo STF quanto pelo STJ nos temas de repercussão geral nº 810 e de recurso repetitivo nº. 905 relativamente aos juros de mora –  Retorno dos autos nos termos do artigo 1.041, §2º do Código de Processo Civil.  Adequação do julgado, nos termos do art. 1.040, II, do CPC para fins de aplicação do quanto julgado no Tema nº 905 - STJ e Tema nº 810  STF.  (TJSP;  Apelação Cível ; Relator (a): Rubens Rihl; Órgão Julgador: 1ª Câmara de Direito Público; Foro Central - Fazenda Pública/Acidentes - 9ª Vara de Fazenda Pública; Data do Julgamento: 04/10/2021; Data de Registro: 04/10/2021)',' JUÍZO DE RETRATAÇÃO –  Artigo 1.030, inciso II, do Código de Processo Civil - Correção Monetária e Juros de Mora - Julgamento do 1.495.146/MG, Tema 905, pelo STJ - Adoção do critério pacificado tanto pelo STF quanto pelo STJ nos temas de repercussão geral nº 810 e de recurso repetitivo nº. 905 relativamente aos juros de mora –  Retorno dos autos nos termos do artigo 1.041, §2º do Código de Processo Civil.  Adequação do julgado, nos termos do art. 1.040, II, do CPC para fins de aplicação do quanto julgado no Tema nº 905 - STJ e Tema nº 810  STF. ','2° grau','Ácordão');

INSERT INTO jurisprudences(lawsuit_number,lawsuit_class,lawsuit_judge,lawsuit_city,lawsuit_city_jurisdiction,trial_date,publication_date,secrecy,lawsuit_court,lawsuit_link_pdf_decision,decision_complete,decision_short,lawsuit_court_jurisdiction,juris_type)
VALUES('0000059-72.2013.8.26.0053',' Apelação Cível / Pensão',' Osvaldo de Oliveira',' São Paulo','12ª Câmara de Direito Público','27-09-2021','27-09-2021','','TJSP','https://esaj.tjsp.jus.br/cjsg/getArquivo.do?cdAcordao=15051696&cdForo=0','SOBRESTAMENTO DE RECURSO ESPECIAL   –  ARTIGO 1.040, II, DO CPC –  Juros e correção monetária –  Lei nº 11.960/09 –  Decisão proferida no REsp nº 1.492.221/PR, Tema nº 905, STJ, DJe 30.10.2019 – Julgamento do RE nº 870.947/SE, Tema nº 810, STF, DJe 20.11.2017 –  Embargos de declaração no RE 870.947/SE que foram rejeitados e afastada a modulação da decisão anteriormente proferida –  Observância da orientação do Superior Tribunal de Justiça no REsp 1.492.221/PR (Tema nº 905) e no RE 870.947/SE (Tema 810) –  Revisão do julgado acolhida.  (TJSP;  Apelação Cível ; Relator (a): Osvaldo de Oliveira; Órgão Julgador: 12ª Câmara de Direito Público; Foro Central - Fazenda Pública/Acidentes - 11ª Vara de Fazenda Pública; Data do Julgamento: 27/09/2021; Data de Registro: 27/09/2021)',' SOBRESTAMENTO DE RECURSO ESPECIAL   –  ARTIGO 1.040, II, DO CPC –  Juros e correção monetária –  Lei nº 11.960/09 –  Decisão proferida no REsp nº 1.492.221/PR, Tema nº 905, STJ, DJe 30.10.2019 – Julgamento do RE nº 870.947/SE, Tema nº 810, STF, DJe 20.11.2017 –  Embargos de declaração no RE 870.947/SE que foram rejeitados e afastada a modulação da decisão anteriormente proferida –  Observância da orientação do Superior Tribunal de Justiça no REsp 1.492.221/PR (Tema nº 905) e no RE 870.947/SE (Tema 810) –  Revisão do julgado acolhida. ','2° grau','Ácordão');

INSERT INTO jurisprudences(lawsuit_number,lawsuit_class,lawsuit_judge,lawsuit_city,lawsuit_city_jurisdiction,trial_date,publication_date,secrecy,lawsuit_court,lawsuit_link_pdf_decision,decision_complete,decision_short,lawsuit_court_jurisdiction,juris_type)
VALUES('0000069-50.2018.8.26.0568',' Apelação Criminal / Estupro',' Ruy Alberto Leme Cavalheiro',' São João da Boa Vista','3ª Câmara de Direito Criminal','28-09-2021','29-09-2021',' (Segredo de Justiça)','TJSP','https://esaj.tjsp.jus.br/cjsg/getArquivo.do?cdAcordao=15061393&cdForo=0','APELAÇÃO –  estupro. Afirmação da vítima, corroborada por conclusão de Laudo pericial psicológico. Vítima que engravidou –  abortamento legal efetuado. Incontroversa a relação sexual, a tese de consentimento da vítima não foi demonstrada pelo apelante –  art. 156, CPP. Ademais, contrariada pelo Laudo pericial psicológico. Apelo negado.Art. 59, CP, a pena foi fundamentada. O critério trifásico foi observado em face dos autos. O regime prisional tem previsão legal.NEGADO PROVIMENTO AO RECURSO.  (TJSP;  Apelação Criminal ; Relator (a): Ruy Alberto Leme Cavalheiro; Órgão Julgador: 3ª Câmara de Direito Criminal; Foro de São João da Boa Vista - Vara Criminal; Data do Julgamento: 28/09/2021; Data de Registro: 29/09/2021)',' APELAÇÃO –  estupro. Afirmação da vítima, corroborada por conclusão de Laudo pericial psicológico. Vítima que engravidou –  abortamento legal efetuado. Incontroversa a relação sexual, a tese de consentimento da vítima não foi demonstrada pelo apelante –  art. 156, CPP. Ademais, contrariada pelo Laudo pericial psicológico. Apelo negado.Art. 59, CP, a pena foi fundamentada. O critério trifásico foi observado em face dos autos. O regime prisional tem previsão legal.NEGADO PROVIMENTO AO RECURSO. ','2° grau','Ácordão');

``` 


