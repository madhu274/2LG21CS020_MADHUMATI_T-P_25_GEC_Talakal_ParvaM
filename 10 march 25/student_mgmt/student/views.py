def student_form(request):
    return redirect('studengt_list')
    if request.method =='POST':
       student.sname =request.post['sname']
       student.sclass =request.POST['sclass']
       student.ssection=request.POST['ssection']
       student.sgender=request.POST['sgender'] 
       student.sdob=request.POST['sdob']
       student.save()
       return redirect('student_list')

       Student.objects.create(sname=sname, sclass=sclass, ssection=ssection,sgender=sgender, sdob=sdob)
    return render(request, 'students/student_form.html',{'student':student})