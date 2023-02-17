# RestAPI

API developed to use data made available on TJSP decisions and apply a simple CRUD API. Build for FIAP fase 3.


| Req    | Endpoint                               | Description                         | Success           | Error                      |
|--------|----------------------------------------|-------------------------------------|-------------------|----------------------------|
| POST   | juris/                                 | Create a new juris on the database  | Status:200        | Status: 500  - JSON        |
| GET    | juris/                                 | Read all juris from database        | Status:200 - JSON | Status: 500  - JSON        | 
| PUT    | juris/{id}                             | Update a juris by given id          | Status:200 - JSON | Status: 500  - JSON        |
| DELETE | juris/{id}                             | Delete a juris by given id          | Status:200 - JSON | Status: 500  - JSON        |
| GET    | juris/{id}                             | Read a juris with given id          | Status:200 - JSON | Status: 500  - JSON        |


## Run Locally 
You need to build the database locally:
- run ```mysql -u root -p``` or similar to start MySQL
- [Database](https://github.com/Darklabel91/RestAPI/blob/master/Scripts/database)
- [Table](https://github.com/Darklabel91/RestAPI/blob/master/Scripts/table)
- [Insert](https://github.com/Darklabel91/RestAPI/blob/master/Scripts/Insert)

Don't forget to check, if needed change the ```url``` ```username``` ```password``` on [dataSource](src/main/java/fiaprestapi/com/example/restapi/dataSource.java)

## Endpoint Examples
- GET juris/1 (error)
```json
{
    "timestamp": "2023-02-17T14:21:32.167+00:00",
    "status": 500,
    "error": "Internal Server Error",
    "trace": "java.lang.Exception: Juris not found!\n\tat fiaprestapi.com.example.restapi.controller.JurisprudenceController.findById(JurisprudenceController.java:40)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:207)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:152)\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:884)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:797)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1080)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:973)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1011)\n\tat org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:903)\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:705)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:885)\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:814)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:223)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:158)\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:185)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:158)\n\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:185)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:158)\n\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:185)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:158)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:185)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:158)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:177)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:97)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:542)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:119)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:78)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:357)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:400)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:859)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1734)\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)\n\tat java.base/java.lang.Thread.run(Thread.java:833)\n",
    "message": "Juris not found!",
    "path": "/juris/1"
}
```

- GET juris/2
```json
{
    "lawsuit_class": "Embargos de Declaração Cível / Desapropriação Indireta",
    "lawsuit_judge": "Daniel Fillol",
    "lawsuit_city": "Porto Ferreira",
    "trial_date": "01-10-2021",
    "decision_short": "Recurso. Ação de Indenização por Apossamento Administrativo (Desapropriação Indireta) movida contra o DER, em fase de execução. Débito atingido pela moratória constitucional do artigo 78 do Ato das Disposições Constitucionais Transitórias. Sentença que julgou extinta a execução (art. 924, inc. II, CPC). Débito atingido pela moratória constitucional do artigo 78 do Ato das Disposições Constitucionais Transitórias. Hipótese em que deve prevalecer o quanto determinado no título sob execução. Inviabilidade, ademais, de aplicação do artigo 5º da Lei Federal nº 11.960/09, declarado inconstitucional \"por arrastamento\" pelo STF. Ademais, se é aplicável o artigo 78 do ADCT à espécie, isto se dá porque o pagamento, \"ipso facto\", não ocorreu no prazo contemplado na parte permanente da Constituição, de modo que devem ser computados juros moratórios sobre as parcelas devidas. Ademais, o STF, na apreciação de medida cautelar nas ADIs 2356 e 2362, suspendeu a eficácia do art. 2º da EC 30/00. Inaplicabilidade à espécie da Súmula Vinculante nº 17 do STF. Não há, ademais, na espécie, título judicial a amparar a pretendida execução contra os autores, ora exequentes. Princípios da economia e da celeridade processuais ininvocáveis diante da regra do art. 783 do CPC. Eventual saldo credor em favor do executado-apelante deverá ser apurado em ação própria. Recurso Extraordinário da Autarquia. Autos restituídos à Câmara pela Egrégia Presidência da Seção de Direito Público, para os fins do artigo 1.040, II, do CPC. Matéria objeto de repercussão geral nos autos do Recurso Extraordinário nº 590.751 (Tema nº 132) e Recurso Extraodinário 1.169.289/SC (Tema 1.037). Hipótese em que o Acórdão recorrido não discrepou do entendimento exarado pelo Supremo Tribunal Federal. Restituição dos autos à Colenda Presidência da Seção de Direito Público deste Tribunal de Justiça, por não se tratar de caso de possível retratação nos termos e para os fins do artigo 1.040, inciso II, do CPC."
}
```

- GET juris/
```json
[
    {
        "lawsuit_class": "Embargos de Declaração Cível / Desapropriação Indireta",
        "lawsuit_judge": "Daniel Fillol",
        "lawsuit_city": "Porto Ferreira",
        "trial_date": "01-10-2021",
        "decision_short": "Recurso. Ação de Indenização por Apossamento Administrativo (Desapropriação Indireta) movida contra o DER, em fase de execução. Débito atingido pela moratória constitucional do artigo 78 do Ato das Disposições Constitucionais Transitórias. Sentença que julgou extinta a execução (art. 924, inc. II, CPC). Débito atingido pela moratória constitucional do artigo 78 do Ato das Disposições Constitucionais Transitórias. Hipótese em que deve prevalecer o quanto determinado no título sob execução. Inviabilidade, ademais, de aplicação do artigo 5º da Lei Federal nº 11.960/09, declarado inconstitucional \"por arrastamento\" pelo STF. Ademais, se é aplicável o artigo 78 do ADCT à espécie, isto se dá porque o pagamento, \"ipso facto\", não ocorreu no prazo contemplado na parte permanente da Constituição, de modo que devem ser computados juros moratórios sobre as parcelas devidas. Ademais, o STF, na apreciação de medida cautelar nas ADIs 2356 e 2362, suspendeu a eficácia do art. 2º da EC 30/00. Inaplicabilidade à espécie da Súmula Vinculante nº 17 do STF. Não há, ademais, na espécie, título judicial a amparar a pretendida execução contra os autores, ora exequentes. Princípios da economia e da celeridade processuais ininvocáveis diante da regra do art. 783 do CPC. Eventual saldo credor em favor do executado-apelante deverá ser apurado em ação própria. Recurso Extraordinário da Autarquia. Autos restituídos à Câmara pela Egrégia Presidência da Seção de Direito Público, para os fins do artigo 1.040, II, do CPC. Matéria objeto de repercussão geral nos autos do Recurso Extraordinário nº 590.751 (Tema nº 132) e Recurso Extraodinário 1.169.289/SC (Tema 1.037). Hipótese em que o Acórdão recorrido não discrepou do entendimento exarado pelo Supremo Tribunal Federal. Restituição dos autos à Colenda Presidência da Seção de Direito Público deste Tribunal de Justiça, por não se tratar de caso de possível retratação nos termos e para os fins do artigo 1.040, inciso II, do CPC."
    },
    {
        "lawsuit_class": " Apelação Criminal / Desacato",
        "lawsuit_judge": " Grassi Neto",
        "lawsuit_city": " Brotas",
        "trial_date": "29-09-2021",
        "decision_short": " Resistência e desacato - Conjunto probatório desfavorável ao réu lastrado em depoimentos coerentes e harmônicos das vítimas policiais – Suficiência à aferição da realização dos tipos penais, da autoria e do doloA jurisprudência tem se inclinado no sentido de que, não havendo fundado motivo que recomende seja a palavra do policial considerada com reservas, suas declarações deverão revestir-se de presunção de veracidade e de legitimidade, que é inerente aos atos administrativos em geral, tendo especial importância, tanto para confirmar os fatos, quanto sua autoria e dolo, referentes a abordagem, da qual resultou prisão do agente por resistência e desacato, ao   opor-se à execução de ato legal, mediante violência ou ameaça a funcionário competente para executá-lo ou a quem lhe esteja prestando auxílio, bem como ao preferir expressão que visava a humilhar funcionário público no exercício de suas funções. "
    },
    {
        "lawsuit_class": " Apelação Cível / Desapropriação Indireta",
        "lawsuit_judge": " Flora Maria Nesi Tossi Silva",
        "lawsuit_city": " Piracicaba",
        "trial_date": "24-09-2021",
        "decision_short": " EXPEDIENTE DA PRESIDÊNCIA DA SEÇÃO DE DIREITO PÚBLICO. DESAPROPRIAÇÃO INDIRETA, movida em 1978, EM FASE DE EXECUÇÃO. V. acórdãos (da fase de cumprimento de sentença), proferidos em 07.11.2012 e 30.01.2013.Devolução dos autos à Turma Julgadora pela E. Presidência da Seção de Direito Público deste Tribunal de Justiça para eventual adequação da fundamentação e/ou manutenção da decisão (art. 1.040, inciso II, do CPC/2015).Desnecessidade de adequação dos v. acórdãos proferidos por esta C. 13ª Câmara de Direito Público. Inaplicabilidade dos temas 810 do STF e 905 do STJ ao caso quanto aos juros, considerando que se trata de ação de desapropriação indireta, que apresenta regramento próprio sobre os juros.No tocante à correção monetária, observo que o título exequendo é oriundo de ação ajuizada no ano de 1978, com fixação de correção monetária e juros de mora vigentes àquela época. Precatório pago em 08 parcelas, tendo sido o último depósito realizado no ano de 2011. A aplicação da Lei 11.960/09 a partir de sua vigência dar-se-ia com desprezo das peculiaridades do caso concreto, revelando ofensa à coisa julgada e ao princípio da segurança e certeza das relações jurídicas.V. ACÓRDÃOS RATIFICADOS, CONSIDERANDO A SITUAÇÃO PECULIAR DO CASO CONCRETO.  "
    },
    {
        "lawsuit_class": " Embargos de Declaração Criminal / Crimes contra a Flora",
        "lawsuit_judge": " Laerte Marrone",
        "lawsuit_city": " Avaré",
        "trial_date": "28-09-2021",
        "decision_short": " Embargos de declaração. Alegação de erro material, omissão e contradição. 1. Erro material configurado na parte inicial do voto: correção determinada. 2. Ausência de contradição ou omissão no julgado. Irresignação que externa simples inconformismo com o mérito da decisão hostilizada, para o qual os embargos de declaração não são instrumento processual adequado, porquanto não se admite, nesta via, uma nova valoração da causa. Embargos acolhidos em parte."
    },
    {
        "lawsuit_class": " Apelação Criminal / Receptação",
        "lawsuit_judge": " Camargo Aranha Filho",
        "lawsuit_city": " Araras",
        "trial_date": "04-10-2021",
        "decision_short": " APELAÇÃO. RECEPTAÇÃO DOLOSA. Artigo 180, caput, do Código Penal. Sentença condenatória. Pleito de reforma da r. sentença. Alegação de fragilidade da prova. Irresignação não acolhida. Materialidade e autoria comprovadas pelo conjunto probatório. Declarações da vítima. Em ilícitos patrimoniais, a palavra da vítima é de suma valia. Testemunhos de agentes policiais. Inquestionável eficácia probatória especialmente quando prestado em juízo, sob a garantia do contraditório. Circunstâncias da investidura na posse da coisa que revela a ciência da origem espúria do bem. Condenação mantida. Dosimetria da pena que, entretanto, comporta reparo. Inquéritos policiais ou ações penais em curso não se prestam para a valoração das circunstâncias judiciais em desfavor do réu, sendo indispensável a certidão indicando condenação com trânsito em julgado. Súmula n. 444, do Colendo Superior Tribunal de Justiça. Pena-base reduzida ao mínimo legal. Regime inicial de cumprimento abrandado para o aberto. Substituição da pena privativa de liberdade por restritivas de direitos. Sentença reformada em parte. RECURSO PARCIALMENTE PROVIDO. "
    },
    {
        "lawsuit_class": " Apelação Cível / Desapropriação por Utilidade Pública / DL 3.365/1941",
        "lawsuit_judge": " Oswaldo Luiz Palu",
        "lawsuit_city": " Guarulhos",
        "trial_date": "24-09-2021",
        "decision_short": " RETRATAÇÃO. Desapropriação. Embargos à Execução. Impugnação aos cálculos. Pagamento integral do crédito. Não incidência da Lei nº 11.960/09.1. Colendo STF que julgou em 20.09.2017 o Tema 810 (RE 870.947/SE), que trata da validade da correção monetária e dos juros moratórios incidentes sobre as condenações impostas à Fazenda Pública. No tocante às relações jurídicas não tributárias, o entendimento é claro quanto à constitucionalidade dos juros moratórios da caderneta de poupança, nos termos da Lei nº 11.960/09, e quanto à inconstitucionalidade dos índices de correção monetária da caderneta de poupança, com aplicação do índice IPCA-E.2. Crédito oriundo de ação de desapropriação, regulada por lei específica, tanto no que concerne ao pedido principal quanto a seus consectários legais, e que não admite o regramento dado pela Lei 9.494/97, seja em sua redação original, seja pela redação dada pela Lei nº 11.960/2009, em estrita consonância com o entendimento proferido pelo C. Superior Tribunal de Justiça em repercussão geral nos autos do REsp nº 1.495.146/MG, Tema 905, DJe 02/03/2018, que assim dispõe: \"(...) 3.1.2. Condenações judiciais referentes a desapropriações diretas e indiretas. No âmbito das condenações judiciais referentes a desapropriações diretas e indiretas existem regras específicas, no que concerne aos juros moratórios e compensatórios, razão pela qual não se justifica a incidência do art. 1º-F da Lei 9.494/97 (com redação dada pela Lei nº 11.960/2009), nem para compensação da mora nem para remuneração do capital. (...)\" 3. Acórdão mantido. Retratação não realizada. "
    },
    {
        "lawsuit_class": " Apelação Criminal / Estelionato",
        "lawsuit_judge": " Grassi Neto",
        "lawsuit_city": " Pirapozinho",
        "trial_date": "30-09-2021",
        "decision_short": " Extinção da punibilidade –  Fatos ocorridos antes da entrada em vigor da Lei n. 12.234/10 –  Sentença condenatória com trânsito em julgado apenas para a acusação –  Fluência, entre a data de publicação da sentença recorrida e o julgamento do recurso, de lapso de tempo superior ao prazo prescricional obtido a partir do quantum de pena aplicado, dentre os previstos no rol do art. 109 do CP –  Ocorrência da prescrição intercorrente da pretensão punitiva nos termos do art. 110, § 1º, do CPEm se cuidando de sentença condenatória com trânsito em julgado apenas para acusação, na hipótese de, entre a data da publicação da sentença condenatória e a do presente julgamento, ter restado superado o lapso prescricional obtido a partir do quantum de pena aplicado, dentre aqueles previstos no rol do art. 109 do CP, torna-se de rigor a decretação da extinção da punibilidade do réu, nos termos do art. 110, § 1º, do CP, pelo advento da prescrição intercorrente da pretensão punitiva. "
    },
    {
        "lawsuit_class": " Apelação Criminal / Furto Qualificado",
        "lawsuit_judge": " Gilda  Alves Barbosa  Diodatti",
        "lawsuit_city": " Piracaia",
        "trial_date": "29-09-2021",
        "decision_short": " PRESCRIÇÃO DA PRETENSÃO PUNITIVA RETROATIVA. DECLARAÇÃO IMPERATIVA. O apelante Brendo foi condenado pela prática dos crimes de violação de domicílio e furto tentado qualificado, respectivamente, às penas de seis meses de detenção, e de oito meses de reclusão e três dias-multa, cujo lapso prescricional é de três anos, reduzido pela metade em razão da menoridade relativa dele à época dos fatos. Ocorre que, entre a data do recebimento da denúncia (22/05/2018) e o dia em que a sentença condenatória tornou-se pública (19/07/2021), transcorreu tal lapso temporal, ausentes causas interruptivas ou suspensivas da prescrição. Nesse cenário, forçosa é a declaração de extinção da punibilidade do acusado, pela prescrição da pretensão punitiva, retroativa. Declarada extinta a punibilidade de Brendo Luciano Cruz Silva, pela prescrição da pretensão punitiva, retroativa. "
    },
    {
        "lawsuit_class": " Apelação Cível / Pagamento Atrasado / Correção Monetária",
        "lawsuit_judge": " Rubens Rihl",
        "lawsuit_city": " São Paulo",
        "trial_date": "04-10-2021",
        "decision_short": " JUÍZO DE RETRATAÇÃO –  Artigo 1.030, inciso II, do Código de Processo Civil - Correção Monetária e Juros de Mora - Julgamento do 1.495.146/MG, Tema 905, pelo STJ - Adoção do critério pacificado tanto pelo STF quanto pelo STJ nos temas de repercussão geral nº 810 e de recurso repetitivo nº. 905 relativamente aos juros de mora –  Retorno dos autos nos termos do artigo 1.041, §2º do Código de Processo Civil.  Adequação do julgado, nos termos do art. 1.040, II, do CPC para fins de aplicação do quanto julgado no Tema nº 905 - STJ e Tema nº 810  STF. "
    },
    {
        "lawsuit_class": " Apelação Cível / Pensão",
        "lawsuit_judge": " Osvaldo de Oliveira",
        "lawsuit_city": " São Paulo",
        "trial_date": "27-09-2021",
        "decision_short": " SOBRESTAMENTO DE RECURSO ESPECIAL   –  ARTIGO 1.040, II, DO CPC –  Juros e correção monetária –  Lei nº 11.960/09 –  Decisão proferida no REsp nº 1.492.221/PR, Tema nº 905, STJ, DJe 30.10.2019 – Julgamento do RE nº 870.947/SE, Tema nº 810, STF, DJe 20.11.2017 –  Embargos de declaração no RE 870.947/SE que foram rejeitados e afastada a modulação da decisão anteriormente proferida –  Observância da orientação do Superior Tribunal de Justiça no REsp 1.492.221/PR (Tema nº 905) e no RE 870.947/SE (Tema 810) –  Revisão do julgado acolhida. "
    },
    {
        "lawsuit_class": "Embargos de Declaração Cível / Desapropriação Indireta",
        "lawsuit_judge": "Aroldo Viotti",
        "lawsuit_city": "Porto Ferreira",
        "trial_date": "01-10-2021",
        "decision_short": "Recurso. Ação de Indenização por Apossamento Administrativo (Desapropriação Indireta) movida contra o DER, em fase de execução. Débito atingido pela moratória constitucional do artigo 78 do Ato das Disposições Constitucionais Transitórias. Sentença que julgou extinta a execução (art. 924, inc. II, CPC). Débito atingido pela moratória constitucional do artigo 78 do Ato das Disposições Constitucionais Transitórias. Hipótese em que deve prevalecer o quanto determinado no título sob execução. Inviabilidade, ademais, de aplicação do artigo 5º da Lei Federal nº 11.960/09, declarado inconstitucional \"por arrastamento\" pelo STF. Ademais, se é aplicável o artigo 78 do ADCT à espécie, isto se dá porque o pagamento, \"ipso facto\", não ocorreu no prazo contemplado na parte permanente da Constituição, de modo que devem ser computados juros moratórios sobre as parcelas devidas. Ademais, o STF, na apreciação de medida cautelar nas ADIs 2356 e 2362, suspendeu a eficácia do art. 2º da EC 30/00. Inaplicabilidade à espécie da Súmula Vinculante nº 17 do STF. Não há, ademais, na espécie, título judicial a amparar a pretendida execução contra os autores, ora exequentes. Princípios da economia e da celeridade processuais ininvocáveis diante da regra do art. 783 do CPC. Eventual saldo credor em favor do executado-apelante deverá ser apurado em ação própria. Recurso Extraordinário da Autarquia. Autos restituídos à Câmara pela Egrégia Presidência da Seção de Direito Público, para os fins do artigo 1.040, II, do CPC. Matéria objeto de repercussão geral nos autos do Recurso Extraordinário nº 590.751 (Tema nº 132) e Recurso Extraodinário 1.169.289/SC (Tema 1.037). Hipótese em que o Acórdão recorrido não discrepou do entendimento exarado pelo Supremo Tribunal Federal. Restituição dos autos à Colenda Presidência da Seção de Direito Público deste Tribunal de Justiça, por não se tratar de caso de possível retratação nos termos e para os fins do artigo 1.040, inciso II, do CPC."
    }
]
```
