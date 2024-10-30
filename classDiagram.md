classDiagram
    class RhombusCheck {
        +main(args: String[]): void
        -isRhombus(distances: int[]): boolean
    }

    class Scanner {
        +nextInt(): int
    }

    class HashMap {
        +put(key: Integer, value: Integer): Integer
        +getOrDefault(key: Integer, defaultValue: Integer): Integer
    }

    RhombusCheck --> Scanner: uses
    RhombusCheck --> HashMap: uses
