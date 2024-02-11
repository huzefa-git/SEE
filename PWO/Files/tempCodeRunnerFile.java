FileOutputStream f = new FileOutputStream("D:\\JavaFiles\\create.txt");
        try {
            String str = "huzefa";
            byte[] bytes = str.getBytes();
            f.write(bytes);
        } catch (IOException e) {

        }
        System.out.println("Written");