class Add {
  constructor(...words) {
    this.words = words;
  }
  
  print() {
    const combinedWords = this.words.join("$");
    console.log("$" + combinedWords + "$");
  }
}

var x = new Add("hehe", "hoho", "haha", "hihi", "huhu");
var y = new Add("this", "is", "awesome");
var z = new Add("lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit");
x.print();  // Output: $hehe$hoho$haha$hihi$huhu$
y.print();  // Output: $this$is$awesome$
z.print();  // Output: $lorem$ipsum$dolor$sit$amet$consectetur$adipiscing$elit$
