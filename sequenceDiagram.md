sequenceDiagram
    participant U as User
    participant P as RhombusCheck

    U->>P: Введите 6 натуральных чисел (расстояния)
    loop Ввод данных
        U->>P: Введите число
    end
    P->>P: isRhombus(distances)
    P->>P: Подсчитываем количество вхождений каждого расстояния
    P->>P: Проверяем условия для ромба
    alt Условия выполнены
        P->>U: YES
    else Условия не выполнены
        P->>U: NO
    end
