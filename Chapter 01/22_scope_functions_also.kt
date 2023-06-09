val length3 = str?.also {
    // Perform additional actions on nullable 'str'
    print("Length of '$it' is ${it.length}")
}?.length
