public class PrimitiveDataTypesDemo {
    public static void main(String[] args) {
        // byte - 8-bit integer
        byte byteValue = 127; // Max value for byte
        System.out.println("Byte value: " + byteValue);

        // short - 16-bit integer
        short shortValue = 32767; // Max value for short
        System.out.println("Short value: " + shortValue);

        // int - 32-bit integer
        int intValue = 2147483647; // Max value for int
        System.out.println("Int value: " + intValue);

        // long - 64-bit integer
        long longValue = 9223372036854775807L; // Max value for long (L suffix is required)
        System.out.println("Long value: " + longValue);

        // float - 32-bit floating point
        float floatValue = 3.14f; // Suffix 'f' is required for float literals
        System.out.println("Float value: " + floatValue);

        // double - 64-bit floating point
        double doubleValue = 3.141592653589793;
        System.out.println("Double value: " + doubleValue);

        // char - 16-bit Unicode character
        char charValue = 'A';
        System.out.println("Char value: " + charValue);

        // boolean - true or false
        boolean booleanValue = true;
        System.out.println("Boolean value: " + booleanValue);
    }
}
