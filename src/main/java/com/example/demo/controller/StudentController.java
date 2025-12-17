
public classs StudentController{
    @Autowired
    StudentService ser;

    @PostMapping("/PostStudent")
    public Student postStd(@RequestBody Student st){
        return ser.insertStudent(st);
    }

    @GetMapping("/getAll")
    public List<Student>getAll(){
        return ser.getAllStudent(st);
    }

    @GetMapping("/get/{id}")
    public Optional<Student> get(@PathVariable Long id){
        return ser.getOneStudent(id);
    }

    
}