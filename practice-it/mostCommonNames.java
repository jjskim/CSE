public static int mostCommonNames(Scanner s) {
    int uniqueNames = 0;
    while (s.hasNextLine()) {
        
        uniqueNames++;
        Scanner line = new Scanner(s.nextLine());

        String curr = line.next();
        int currCount = 1;

        String mostCommon = curr;
        int mostCommonCount = 1;

        while (line.hasNext()) {
            String next = line.next();
            if (next.equals(curr)) {
                currCount++;
            } else {
                if (currCount > mostCommonCount) {
                    mostCommon = curr;
                    mostCommonCount = currCount;
                }
                curr = next;
                currCount = 1;
                uniqueNames++;
            }
        }
        
        if (currCount > mostCommonCount) {
            mostCommon = curr;
            mostCommonCount = currCount;
        }
        
        System.out.println("Most common: " + mostCommon);
    }
    return uniqueNames;
}