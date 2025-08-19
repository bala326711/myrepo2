class Needleinhaystack {
    public static void main(String[] args) {
        String haystack = "i am bala percieving b.tech graduation";
        String needle = "graduation";
        int index = haystack.indexOf(needle);
        if (index != -1) {
            System.out.println("Needle found at position: " + index);
        } else {
            System.out.println("Needle not found.");
        }
    }
}
