llist.sort((x, y) -> {
            for (int i = 0; i < Math.min(x.size(), y.size()); i++) {
                if (x.get(i) != y.get(i)) {
                    return x.get(i) - y.get(i);
                }
            }
            return x.size() - y.size();
        });

//OR

llist.sort((a,b) -> a.get(0) - b.get(0));
