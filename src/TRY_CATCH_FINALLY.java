class Except {

        public static void main(String[] args) {
                int []a = new int[5];
                System.out.println("Hello world");

                try {
                        System.out.println(a[10]);
                }
                catch (Exception e){
                        System.out.println("Hndle exception");
                }
                finally {
                        System.out.println("Excepiton handled");
                }
        }
}