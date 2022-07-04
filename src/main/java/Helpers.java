class Helpers {
    static String padLeft(int s, int n) {
        return String.format("%" + n + "s", s).replace(' ', '0');
    }
}
