<small>

## Java полное руководство - Герберт Шилдт, 10-е издание, 2018.  

<details><summary>Глава 1. "История и развитие языка Java"</summary>

>Происхождение Java (стр. 35)  
>Зарождение современного программирования: язык С (стрю 36)  
>Создание языка Java (стр. 39)  
>Аплеты на Java (стр. 42)  
>Безопасность (стр. 43)  
>Переносимость (стр. 43)  
>Байт-код (стр. 44)  
>Сервлеты: серверные программы на Java (стр. 46)   
>* простота;
>* безопасность;
>* переносимость;
>* объектная ориентированность;
>* надежность;
>* многопоточность;
>* архитектурная нейтральность;
>* интерпретируемость;
>* высокая производительность;
>* распределенность;
>* динамичность. 

</details>

<details><summary>Глава 2. "Краткий обзор Java"</summary>

>**Абстракция (Стр. 58)**  
>
>Важным элементом ООП является абстракция. Человеку свойственно представлять сложные явления и объекты, прибегая к абстракции. Например, люди
 представляют себе автомобиль не в виде набора десятков тысяч отдельных деталей, а в виде совершенно определенного объекта, имеющего свое особое поведение. Эта абстракция позволяет не задумываться о сложности деталей, составляющих автомобиль, скажем, при поездке в магазин. Можно не обращать внимания
 на подробности работы двигателя, коробки передач и тормозной системы. Вместо этого объект можно использовать как единое целое.  
 Эффективным средством применения абстракции служат иерархические классификации. Это позволяет упрощать семантику сложных систем, разбивая их на более управляемые части. Внешне автомобиль выглядит единым объектом. Но
 стоит заглянуть внутрь, как становится ясно, что он состоит из нескольких подсистем: рулевого управления, тормозов, аудиосистемы, привязных ремней, обогревателя, навигатора и т.п. Каждая из этих подсистем, в свою очередь, собрана из более
 специализированных узлов. Например, аудиосистема состоит из радиоприемника, проигрывателя компакт-дисков и/или аудиокассет. Суть всего сказанного состоит в том, что структуру автомобиля (или любой другой сложной системы) можно
 описать с помощью иерархических абстракций.  
 Иерархические абстракции сложных систем можно применять и к компьютерным программам. Благодаря абстракции данные традиционной, ориентированной
 на процессы, программы можно преобразовать в составляющие ее объекты, а последовательность этапов процесса - в совокупность сообщений, передаваемых
 между этими объектами. Таким образом, каждый из этих объектов описывает свое
 особое поведение. Эти объекты можно считать отдельными сущностями, реагирующими на сообщения, предписывающие им выполнить конкретное действие.
 В этом, собственно, и состоит вся суть ООП.  
 Принципы ООП лежат как в основе языка Java, так и восприятия мира человеком.
 Важно понимать, каким образом эти принципы реализуются в программах. Как станет
 ясно в дальнейшем, ООП является еще одной, но более эффективной и естественной
 парадигмой создания программ, способных пережить неизбежные изменения, сопровождающие жизненный цикл любого крупного программного проекта, включая зарождение общего замысла, развитие и созревание. Например, при наличии тщательно
 определенных объектов и ясных, надежных интерфейсов с этими объектам можно
 безбоязненно и без особого труда извлекать или заменять части старой системы.
>
>**Инкапсуляция (Стр. 59)**  
>
>Механизм, связывающий код и данные, которыми он манипулирует, защищая оба эти компонента от внешнего вмешательства и злоупотреблений, называется инкапсуляцией. Инкапсуляцию можно считать защитной оболочкой, которая предохраняет код и данные от произвольного доступа со стороны другого кода, находящегося
 снаружи оболочки. Доступ к коду и данным, находящимся внутри оболочки, строго контролируется тщательно определенным интерфейсом. Чтобы провести аналогию с реальным миром, рассмотрим автоматическую коробку передач автомобиля.
 Она инкапсулирует немало сведений об автомобиле, в том числе величину ускорения, крутизну поверхности, по которой совершается движение, а также положение
 рычага переключения скоростей. Пользователь (в данном случае водитель) может оказывать влияние на эту сложную инкапсуляцию только одним способом: перемещая рычаг переключения скоростей. На коробку передач нельзя воздействовать,
 например, с помощью индикатора поворота или дворников. Таким образом, рычаг переключения скоростей является строго определенным, а по существу, единственным интерфейсом с коробкой передач. Более того, происходящее внутри коробки
 передач не влияет на объекты, находящиеся вне ее. Например, переключение передач не включает фары! Функция автоматического переключения передач инкапсулирована, и поэтому десятки изготовителей автомобилей могут реализовать ее как
 угодно. Но с точки зрения водителя все эти коробки передач работают одинаково.
 Аналогичный принцип можно применять и в программировании. Сильная сторона инкапсулированного кода состоит в следующем: всем известно, как получить доступ
 к нему, а следовательно, его можно использовать независимо о подробностей реализации и не опасаясь неожиданных побочных эффектов.  
 Основу инкапсуляции в Java составляет класс. Подробнее классы будут рассмотрены в последующих главах, а до тех пор полезно дать хотя бы краткое их описание.
 Класс определяет структуру и поведение (данные и код), которые будут совместно
 использоваться набором объектов. Каждый объект данного класса содержит структуру и поведение, которые определены классом, как если бы объект был "отлит"
 в форме класса. Поэтому иногда объекты называют экземплярами класса. Таким образом, класс - это логическая конструкция, а объект - ее физическое воплощение.
 При создании класса определяются код и данные, которые образуют этот класс.  
 Совместно эти элементы называются членами класса. В частности, определенные в классе данные называются переменными-членами или переменными экземпляра,
 а код, оперирующий данными, - методами-членами или просто методами. (То, что программирующие на Java называют методами, программирующие на С/С++ называют функциями.) В программах, правильно написанных на Java, методы определяют, 
 60 Часть 1. Язык Java каким образом используются переменные-члены. Это означает, что поведение и интерфейс класса определяются методами, оперирующими данными его экземпляра.  
 Назначение класса состоит в инкапсуляции сложной структуры программы, и поэтому существуют механизмы сокрытия сложной структуры реализации в самом
 классе. Каждый метод или переменная в классе могут быть помечены как закрытые или открытые. Открытый интерфейс класса представляет все, что должны или могут знать внешние пользователи класса. Закрытые методы и данные могут быть доступны только для кода, который является членом данного класса. Следовательно,
 любой другой код, не являющийся членом данного класса, не может получать доступ к закрытому методу или переменной. Закрытые члены класса доступны другим частям программы только через открытые методы класса, и благодаря этому исключается возможность выполнения неправомерных действий. Это, конечно, означает,
 что открытый интерфейс должен быть тщательно спроектирован и не должен раскрывать лишние подробности внутреннего механизма работы класса
>
>**Наследование (Стр. 59)**  
>
>Процесс, в результате которого один объект получает свойства другого, называется наследованием. Это очень важный принцип ООП, поскольку наследование обеспечивает принцип иерархической классификации. Как отмечалось ранее,
 большинство знаний становятся доступными для усвоения благодаря иерархической (т.е. нисходящей) классификации. Например, золотистый ретривер - часть
классификации собак, которая, в свою очередь, относится к классу млекопитающих, а тот - к еще большему классу животных. Без иерархий каждый объект должен был бы явно определять все свои характеристики. Но благодаря наследованию
объект должен определять только те из них, которые делают его особым в классе. Объект может наследовать общие атрибуты от своего родительского объекта.
Таким образом, механизм наследования позволяет сделать один объект частным
случаем более общего случая. Рассмотрим этот механизм подробнее.  
Как правило, большинство людей воспринимают окружающий мир в виде иерархически связанных между собой объектов, подобных животным, млекопитающим и собакам. Если требуется привести абстрактное описание животных, можно сказать, что они обладают определенными свойствами: размеры, умственные
способности и костная система. Животным присущи также определенные особенности поведения: они едят, дышат и спят. Такое описание свойств и поведения составляет определение класса животных.  
Если бы потребовалось описать более конкретный класс животных, например
млекопитающих, следовало бы указать и более конкретные свойства, в частности
тип зубов и молочных желез. Такое определение называется подклассом животных, которые относятся к суперклассу (родительскому классу) млекопитающих.
А поскольку млекопитающие - лишь более точно определенные животные, то они
наследуют все свойства животных. Подкласс нижнего уровня иерархии классов
наследует все свойства каждого из его родительских классов  
>
>**Полиморфизм (Стр. 63)**  
>
>Полиморфизм (от греч. "много форм") - это принцип ООП, позволяющий использовать один и тот же интерфейс для общего класса действий. Каждое действие
 зависит от конкретной ситуации. Рассмотрим в качестве примера стек, действующий как список обратного магазинного типа. Допустим, в программе требуются
 стеки трех типов: для целочисленных значений, для числовых значений с плавающей точкой и для символов. Алгоритм реализации каждого из этих стеков остается неизменным, несмотря на отличия в данных, которые в них хранятся. В языке,
 не являющемся объектно-ориентированным, для обращения со стеком пришлось бы создавать три разных ряда подпрограмм под отдельными именами. А в языке Java благодаря принципу полиморфизма для обращения со стеком можно определить общий ряд подпрограмм под одними и теми же общими именами.  
 В более общем смысле принцип полиморфизма нередко выражается фразой "один интерфейс, несколько методов': Это означает, что можно разработать общий интерфейс для группы связанных вместе действий. Такой подход позволяет уменьшить сложность программы, поскольку один и тот же интерфейс служит
 для указания общего класса действий. А выбор конкретного действия (т.е. метода) делается применительно к каждой ситуации и входит в обязанности компилятора.
 Это избавляет программиста от необходимости делать такой выбор вручную. Ему нужно лишь помнить об общем интерфейсе и правильно применять его.  
 Если продолжить аналогию с собаками, то можно сказать, что собачье обоняние - полиморфное свойство. Если собака почувствует запах кошки, она залает
 и погонится за ней. А если собака почувствует запах своего корма, то у нее начнется слюноотделение, и она поспешит к своей миске. В обоих случаях действует одно
 и то же чувство обоняния. Отличие лишь в том, что именно издает запах, т.е. в типе данных, воздействующих на нос собаки! Этот общий принцип можно реализовать, применив его к методам в программе на Java. 
>

</details>

<details><summary>Глава 3. "Типы данных, переменные и массивы"</summary>

>>* **Целые числа.**   
>>Тип Ьуtе 8-разрядный тип данных со знаком от -128 до 127.  
>>Тип short представляет 16-разрядные целочисленные значения со знаком в пределах от -32768 до 32767. Этот тип данных применяется в Java реже всех остальных.  
>>Тип int это тип 32-разрядных целочисленных значений со знаком в пределах от -2147483648 до 2147483647.  
>>Тип long этот тип 64-разрядных целочисленных значений со знаком удобен в тех случаях, когда длины типа int недостаточно для хранения требуемого значения.   
>>* **Числа с плавающей точкой.**  
>>Тип float Этот тип определяет числовое значение с плавающей точкой одинарной точности, для хранения которого в оперативной памяти требуется 32 бита.  
>>Тип dоuЫе Для хранения числовых значений с плавающей точкой двойной точности, как обозначает ключевое слово douЫ е, в оперативной памяти требуется 64 бита.    
>>* **Символы.**  
>>Эта группа включает в себя тип данных char, представляющий символы, например буквы и цифры, из определенного набора.  
>>**Тип данных char.**  
>>Символы представлены в Юникоде (Unicode), для хранения этих символов требуется 16 бит, диапазон  от О до 65536.  

>>* **Логические значения.**  
>>Тип boolean, предназначенный для хранения логических значений. Переменные этого типа могут принимать только одно из двух возможных значений: true (истинное) или false (ложное).  

>>**Управляющие последовательности символов**  
>>|Управляющая последовательность|Описание|
>>|:-----------------------------|:-------|
>>|\ddd|Восьмеричный символ ( ddd) |
>>|\uxxxx|Шестнадцатеричный символ в Юникоде (.хххх)|
>>|\'|Одинарная кавычка|
>>|\"|Двойная кавычка|
>>|\\|Обратная косая черта|
>>|\r|Возврат каретки|
>>|\n|Новая строка (или перевод строки)|
>>|\f|Подача страницы|
>>|\t|Табуляция|
>>|\b|Возврат на одну позицию ("забой")|

>>**Область видимости и срок действия переменных**  
>>При открытии каждого нового блока кода создается новая область видимости. Область видимости определяет, какие именно объекты доступны для других частей программы. Она определяет также продолжительность существования этих объектов.  
>>Области видимости могут быть вложенными. Так, вместе с каждым блоком кода, по существу, создается новая, вложенная область видимости. В таком случае внешняя область видимости включает в себя внутреннюю область. Это означает, что объекты, объявленные во внешней области видимости, будут доступны
для кода из внутренней области видимости, но не наоборот. Объекты, объявленные во внутренней области видимости, будут недоступны за ее пределами.  
>>**Автоматическое преобразование типов в Java**  
>>Когда данные одного типа присваиваются переменной другого типа, выполняется автоматическое преобразование типов, если удовлетворяются два условия:  
>
>>* оба типа совместимы;  
>>* длина целевого типа больше длины исходного типа.  
>
>>**Правила продвижения типов**
>>В языке Java определен ряд правил продвижения типов, применяемых к выражениям. Сначала все значения типа byte, short и char продвигаются к типу int,
  как пояснялось выше. Затем тип всего выражения продвигается к типу long, если
  один из его операндов относится к типу long. Если же один из операндов относится к типу float, то тип всего выражения продвигается к типу float. А если
  любой из операндов относится к типу douЫe, то и результат вычисления всего
  выражения относится к типу douЫe.  
>
>[Conversion - Продемонстрировать приведение типов](https://github.com/aykononov/JavaSchildt/tree/master/Chapter03/Conversion.java "Посмотреть пример")  
>[Scope - Продемонстрировать область видимости блока кода](https://github.com/aykononov/JavaSchildt/tree/master/Chapter03/Scope.java "Посмотреть пример")  
>
>>**Массивы**  
>>Массив - это группа однотипных переменных, для обращения к которым используется общее имя. В языке Java допускается создание массивов любого типа
  и разной размерности. Доступ к конкретному элементу массива осуществляется по его индексу. Массивы предоставляют удобный способ группирования связанной вместе информации.  
>>Массивы бывают ОДНОМЕРНЫЕ и МНОГОМЕРНЫЕ.  
>
>[Array - Продемонстрировать применение одномерного массива](https://github.com/aykononov/JavaSchildt/tree/master/Chapter03/Array.java "Посмотреть пример")
>[CountDayArray - Усовершенствованная версия предыдущей программы](https://github.com/aykononov/JavaSchildt/tree/master/Chapter03/CountDayArray.java "Посмотреть пример")    
>[TwoDArray - Двумерный массив](https://github.com/aykononov/JavaSchildt/tree/master/Chapter03/TwoDArray.java "Посмотреть пример")  
>[Matrix - Инициализировать двухмерный массив](https://github.com/aykononov/JavaSchildt/tree/master/Chapter03/Matrix.java "Посмотреть пример")  
>[DuoArray - Применение двумерного массива](https://github.com/aykononov/JavaSchildt/tree/master/Chapter03/DuoArray.java "Посмотреть пример")  
>[ThreeArray - Пример трехмерного массива](https://github.com/aykononov/JavaSchildt/tree/master/Chapter03/ThreeArray.java "Посмотреть пример")  
>[TwoDAgain - Резервирование памяти вручную для массива с разной размерностью второго измерения](https://github.com/aykononov/JavaSchildt/tree/master/Chapter03/TwoDAgain.java "Посмотреть пример")  
>[Average - Вычисление среднего из массива значений](https://github.com/aykononov/JavaSchildt/tree/master/Chapter03/TwoDAgain.java "Посмотреть пример")  
</details>

<details><summary>Глава 4. "Операции"</summary>

>(Стр. 109)
>
>["Chapter04" - пока только примеры](https://github.com/aykononov/JavaSchildt/tree/master/Chapter04/ "Посмотреть пример")

</details>

<details><summary>Глава 5. "Управляющие операторы"</summary>

>(Стр. 131)
>
>["Chapter05" - пока только примеры](https://github.com/aykononov/JavaSchildt/tree/master/Chapter05/ "Посмотреть пример")

</details>

<details><summary>Глава 6. "Введение в классы"</summary>

>(Стр. 163)
>
>["Chapter06" - пока только примеры](https://github.com/aykononov/JavaSchildt/tree/master/Chapter06/ "Chapter06")

</details>

<details><summary>Глава 7. "Подробное рассмотрение классов и методов"</summary>

>(Стр. 185)
>
>["Chapter07" - пока только примеры](https://github.com/aykononov/JavaSchildt/tree/master/Chapter07/ "Chapter07")

</details>

<details><summary>Глава 8. "Наследование"</summary>

><details><summary>Основы наследования. (стр. 221)</summary>
>
>>Как только суперкласс, который определяет общие свойства объекта, будет создан, он может наследоваться для разработки специализированных классов. Каждый подкласс добавляет собственные особые характеристики. В этом и состоит вся суть наследования.
>>
>>[SimpleInheritance01 - Простой пример наследования](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/SimpleInheritance01.java)
>
></details>

><details><summary>Практический пример наследования. (стр. 224)</summary>
>
>>Если ссылочной переменной из Суперкласса присваивается ссылка на объект Подкласса, то доступ предоставляется только к указанным в ней частям объекта, определяемого в Суперклассе, потому-что Суперклассу неизвестно, что именно добавляет в него Подкласс.
>>
>>[DemoBoxWeight02 - Пример, где наследование применяется для расширения класса](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/DemoBoxWeight02.java)
>
></details>

><details><summary>Вызов конструкторов Суперкласса с помощью ключевого слова super. (стр. 227)</summary>
>
>>При вызове метода super() из Подкласса вызывается конструктор его непосредственного Суперкласса. Таким образом, метод super() всегда обращается к Суперклассу, находящемуся в иерархии непосредственно над вызывающим классом. Это справедливо даже для многоуровневой иерархии. Кроме того, вызов метода super() должен быть непременно сделан в первом операторе, выполняемом в теле конструктора Подкласса.
>>
>>[DemoBoxWeight03 - Вызов конструкторов Суперкласса с помощью ключевого слова super](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/DemoBoxWeight03.java)
>
></details>

><details><summary>Посмотрим на ссылочные переменные...</summary>
>
>>Можно посмотреть и сравнить, как выглядят ссылочные переменные при клонировании объектов и копировании ссылок на объекты.
>>
>>[ReferenceVariables04 ](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/ReferenceVariables04.java)
>
></details>

><details><summary>Создание многоуровневой иерархии. (стр. 232)</summary>
>
>>Каждый Подкласс наследует все характеристики всех его Суперклассов. Подкласс BoxWeight служит в качестве Суперкласса для создания Подкласса BoxShipment и добавляет к ним поле cost. Благодаря наследованию в классе BoxShipment можно использовать ранее определенные классы Вох и BoxWeight, добавляя только те дополнительные данные, которые требуются для его собственного специализированного применения. В этом и состоит одна из самых ценных особенностей наследования. Она позволяет использовать код повторно. Приведенный пример демонстрирует еще одну важную особенность наследования: метод super() всегда ссылается на конструктор ближайшего по иерархии Суперкласса. В методе super() из класса BoxSlipment вызывается конструктор класса BoxWeight. А в методе super() из класса BoxWeight вызывается конструктор класса Вох. Если в иерархии классов требуется передать параметры конструктору Cуперкласса, то все подклассы должны передавать эти параметры вверх по иерархии. Данное утверждение справедливо независимо от того, нуждается ли Подкласс в собственных параметрах.
>>
>>[DemoShipment05 - Пример, создания многоуровневой иерархии](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/DemoShipment05.java)
>
></details>

><details><summary>Порядок вызова конструкторов. (стр. 235)</summary>
>
>>В иерархии классов конструкторы вызываются в порядке наследования, начиная с суперкласса и кончая подклассом. Более того, этот порядок остается неизменным независимо от того, используется форма super() или нет, поскольку вызов метода super() должен быть в первом операторе, выполняемом в конструкторе подкласса. Если метод super() не вызывается, то используется конструктор по умолчанию или же конструктор без параметров из каждого суперкласса.
>>
>>[CallingConstr06 - Порядок вызова конструкторов](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/CallingConstr06.java)
>
></details>

><details><summary>Переопределение методов. (стр. 236)</summary>
>
>>Если в иерархии классов совпадают имена и сигнатуры типов методов из Подкласса и Суперкласса, то говорят, что метод из Подкласса переопределяет метод из Суперкласса. Когда переопределенный метод вызывается из своего Подкласса, он всегда ссылается на свой вариант, определенный в Подклассе. А вариант метода, определенный в Суперклассе, будет скрыт.
>>
>>[OverrideMethod07 - Пример, переопределения методов](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/OverrideMethod07.java)
>
></details>

><details><summary>Перегрузка методов. (стр. 238)</summary>
>
>>Переопределение методов выполняется только в том случае, если имена и сигнатуры типов обоих методов одинаковы. В противном случае оба метода считаются перегружаемыми.
>>
>>[OverloadMethod08 - Пример, перегрузки методов](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/OverloadMethod08.java)
>
></details>

><details><summary>Динамическая диспетчеризация методов. (стр. 239)</summary>
>
>>Динамическая диспетчеризация методов - это механизм, с помощью которого вызов переопределенного метода разрешается во время выполнения, а не компиляции.
>>Ссылочная переменная из Суперкласса может ссылаться на объект Подкласса. Когда переопределенный метод вызывается по ссылке на Суперкласс, нужный вариант этого метода выбирается в Java в зависимости от типа объекта, на который делается ссылка в момент вызова.
>>
>>В этом примере создаются один Суперкласс А и два его Подкласса В и С. В Подклассах В и С переопределяется метод callme(), объявляемый в классе А. В методе main() объявляются объекты классов А, В и С, а также переменная ref ссылки на объект типа А. Затем переменной ref присваивается по очереди ссылка на объект каждого из классов А, В и С, и по этой ссылке вызывается метод callme().
>>Как следует из результата, выводимого этой программой, выполняемый вариант метода callme() определяется исходя из типа объекта, на который делается ссылка в момент вызова. Если бы выбор делался по типу ссылочной переменной ref, то выводимый результат отражал бы три вызова одного и того же метода callme() из класса А.
>>
>>[DynamicMethodDispatching09 - Динамическая диспетчеризация методов](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/DynamicMethodDispatching09.java)
>
></details>

><details><summary>Назначение и Применение переопределенных методов. (стр. 240 - 241)</summary>
>
>>Переопределенные методы позволяют поддерживать в Java полиморфизм во время выполнения. Это позволяет определить в общем классе методы, которые станут общими для всех производных от него классов, а в подклассах - конкретные реализации некоторых или всех этих методов.
>>
>>Переопределенные методы предоставляют еще один способ реализовать в Java принцип полиморфизма "один интерфейс, множество методов".
>>
>>Одним из основных условий успешного применения полиморфизма является ясное понимание, что суперклассы и подклассы образуют иерархию по степени увеличения специализации. Если суперкласс применяется правильно, он предоставляет все элементы, к<?торые могут непосредственно использоваться в подклассе. В нем также определяются те методы, которые должны быть реализованы в самом производном классе. Это дает удобную возможность определять в подклассе его собственные методы, сохраняя единообразие интерфейса. Таким образом, сочетая наследование с переопределенными методами, в суперклассе можно определить общую форму для методов, которые будут использоваться во всех его подклассах.
>>
>>Динамический полиморфизм, реализуемый во время выполнения, это один из самых эффективных механизмов объектно-ориентированной архитектуры, обеспечивающих повторное использование и надежность кода. Возможность вызывать из библиотек уже существующего кода методы для экземпляров новых классов, не прибегая к повторной компиляции и в то же время сохраняя ясность абстрактного интерфейса, является сильнодействующим средством.
>>
>>Практический пример, в котором применяется переопределение методов. В приведенной ниже программе создается суперкласс Figure для хранения размеров двумерного объекта, а также определяется метод area() для расчета площади этого объекта. Кроме того, в этой программе создаются два класса,
>>Rectangle и Triangle, производные от класса Figure. Метод area() переопределяется в каждом из этих подклассов, чтобы возвращать площадь четырехугольника и треугольника соответственно.
>>   
>>[FigureFindArea10 - Применение динамического полиморфизма](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/FigureFindArea10.java)
>
></details>

><details><summary>Применение абстрактных классов. (стр. 242 - 245)</summary>
>
>>Чтобы убедиться, что в подклассе действительно переопределяются все необходимые методы, достаточно в суперклассе объявить их с модификатором доступа abstract. В суперклассе для них никакой реализации не предусмотрено. Следовательно, эти методы должны быть переопределены в подклассе, где нельзя просто воспользоваться их вариантом, определенным в суперклассе.
>>
>>Любой класс, содержащий один или несколько абстрактных методов, должен  быть также объявлен как абстрактный. У абстрактного класса не может быть никаких объектов. Это означает, что экземпляр абстрактного класса не может быть получен непосредственно с помощью операции new.
>>Любой подкласс, производный от абстрактного класса, должен реализовать все абстрактные методы из своего суперкласса или же сам быть объявлен абстрактным.
>>
>>Кроме того, нельзя объявлять абстрактные конструкторы или абстрактные статические методы.
>>   
>>[AbstractDemo11 - Применение абстрактных методов и классов](https://github.com/aykononov/JavaSchildt/blob/master/Chapter08/AbstractDemo11.java)
>
></details>

><details><summary>Предотвращение переопределения с помощью ключевого слова final. (стр. 246)</summary>
>
>>Методы, объявленные как f inal, переопределяться не могут. Это способствует увеличению производительности программы, поскольку Компилятор вправе встраивать вызовы этих методов, так как ему известно, что они не будут переопределены в подклассе.  
>>
>>```java
>>class A {
>>    final void meth() {
>>        System.out.println("Этo конечный метод.");
>>    }   
>>}
>>class B extends A {
>>    void meth() {
>>        // ОШИБКА!!! Этот метод не может быть переопределен.
>>    }
>>}
>>```
></details>

><details><summary>Предотвращение наследования с помощью ключевого слова final. (стр. 247)</summary>
>
>>Иногда требуется предотвратить наследование класса. Для этого в начале объявления класса следует указать ключевое слово f inal. Объявление класса конечным неявно делает конечными и все его методы. Нетрудно догадаться, что одновременное объявление класса как abstract и final недопустимо, поскольку абстрактный класс принципиально является незавершенным, и только его подклассы предоставляют полную реализацию методов. Ниже приведен пример конечного класса.
>>Как следует из комментария к приведенному выше коду, класс В не может наследовать от класса А, поскольку класс А объявлен конечным.
>>
>>```java
>>final class A {
>>    // ...
>>}
>>// Следующий класс недопустим!!!
>>class B extends A {
>>   // ОШИБКА!!! Класс А не может иметь подклассы.
>>}
>>```
></details>

><details><summary>Класс Object (стр. 248)</summary>
>
>>В языке Java определен один специальный класс, называемый Obj ect. Все остальные классы являются подклассами, производными от этого класса. Это означает, что класс Obj ect служит суперклассом для всех остальных классов, и ссылочная переменная из класса Obj ect может ссылаться на объект любого другого класса. А поскольку массивы реализованы в виде классов, то ссылочная переменная типа Obj ect может ссылаться и на любой массив. В классе Obj ect определены методы, перечисленные ниже:
>>
>>|Метод |Назначение |
>>|:-----------------------------|:-------------------------------------|
>>|Object clone() |Создает новый объект, не отличающийся от клонируемго |
>>|boolean equals(Object object) | Определяет, равен ли один объект другому |
>>|void finalize() |Вызывается перед удалением неиспользуемого объекта (не рекомендован для применения, начиная с версии JDK 9) |
>>|Class<?> getClass() |Получает класс объекта во время выполнения |
>>|int hashCode() |Возвращает хеш-код, связанный с вызывающим объектом |
>>|void notify() |Возобновляет исполнение потока, ожидающего вызывающего объекта |
>>|void notifyAll() |Возобновляет исполнение всех потоков, ожидающих вызывающий объект |
>>|String toString() |Возвращает символьную строку, описывающую объект |
>>|void wait() |Ожидает другого потока исполнения |
>>|void wait(long миллисекунд) |Ожидает другого потока исполнения |
>>
>>Методы getClass(), notify(), notifyAll() и wait() объявлены как final. Остальные методы можно переопределять (они будут описаны в последующих главах данной книги). Обратите, однако, внимание на два метода: equals() и toString(). Метод equals() сравнивает два объекта. Если объекты равны, он возвращает логическое значение true, а иначе - логическое значение false.
>>Точное определение равенства зависит от типа сравниваемых объектов. Метод toString() возвращает символьную строку с описанием объекта, для которого он вызван. Кроме того, метод toString() вызывается автоматически, когда содержимое объекта выводится с помощью метода println(). Этот метод переопределяется во многих классах, чтобы приспосабливать описание к создаваемым в них конкретным типам объектов.
>
></details>

</details>

<details><summary>Глава 9. "Пакеты и интерфейсы"</summary>

><details><summary>Определение пакета (стр. 250)</summary>
>
>>Пакеты являются контейнерами классов и служат для разделения пространств имен классов.  
>>Классы и пакеты одновременно служат для инкапсуляции и обозначения пространства имен и области видимости переменных и методов. Пакеты служат в качестве контейнеров для классов и других подчиненных пакетов, а классы - для данных и кода. Класс - наименьшая единица абстракции в Java. Характер взаимодействия пакетов и классов в Java определяет четыре категории доступности членов классов.  
>>* Подклассы из одного пакета.
>>* Классы из одного пакета, не являющиеся подклассами.
>>* Подклассы из разных пакетов.
>>* Классы, не относящиеся к одному пакету и не являющиеся подклассами.  
>>Три модификатора доступа (private, puЬlic и protected) обеспечивают  различные способы создания многих уровней доступа, необходимых для этих категорий.  
Любой компонент, объявленный как (puЬlic), доступен из любого кода. А любой компонент, объявленный как (private), недоступен для компонентов, находящихся за пределами его класса. 
Если в объявлении члена класса отсутствует явно указанный модификатор доступа, этот член доступен для подклассов и других классов из данного пакета. Такой уровень доступа используется по умолчанию.
Если же требуется, чтобы компонент был доступен за пределами его текущего пакета, но только классам, непосредственно производным от данного класса, такой компонент должен быть объявлен как (protected).  
Для класса, не являющегося вложенным, может быть указан только один из двух возможных уровней доступа: по умолчанию и открытый (puЬlic). Если класс объявлен как (puЬlic), он доступен из любого другого кода. 
Если у класса имеется уровень доступа по умолчанию, такой класс оказывается доступным только для кода из данного пакета. Если же класс оказывается открытым, он должен быть единственным открытым классом, объявленным в файле, а имя этого файла должно
совпадать с именем класса. 
>
></details>

><details><summary>Пример доступа к пакетам. (стр. 254)</summary>
>
>>[Chapter09/pkg01/MainDemo - получить экземпляры различных классов из пакета pkg01](https://github.com/aykononov/JavaSchildt/blob/master/Chapter09/pkg01/MainDemo.java)
>
>>[Chapter09/pkg01/MainDemo - получить экземпляры различных классов из пакета pkg02](https://github.com/aykononov/JavaSchildt/blob/master/Chapter09/pkg02/MainDemo.java)
>
></details>

</details>

</small>