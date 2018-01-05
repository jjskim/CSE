public static void printDuplicates(Scanner input) {
    while (input.hasNextLine()) {
        Scanner line = new Scanner(input.nextLine());
        String current = line.next();
        int count = 1;
        while (line.hasNext()) {
            String next = line.next();
            if (next.equals(current)) {
                count++;
            } else {
                if (count > 1) { 
                    System.out.print(current + "*" + count + " ");
                }
                count = 1;
                current = next;
            }
        }
        if (count > 1) {
            System.out.print(current + "*" + count);
        }
        System.out.println();
    }
}