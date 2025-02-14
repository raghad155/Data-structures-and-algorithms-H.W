int a = 12, b = 5, n = 100, seed = 92;
for (int i = 0; i < 5; i++) {
    seed = (a * seed + b) % n;
    System.out.println(seed);
}