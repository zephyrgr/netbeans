#Signature file v4.1
#Version 0.50

CLSS public java.lang.Object
cons public init()
meth protected java.lang.Object clone() throws java.lang.CloneNotSupportedException
meth protected void finalize() throws java.lang.Throwable
meth public boolean equals(java.lang.Object)
meth public final java.lang.Class<?> getClass()
meth public final void notify()
meth public final void notifyAll()
meth public final void wait() throws java.lang.InterruptedException
meth public final void wait(long) throws java.lang.InterruptedException
meth public final void wait(long,int) throws java.lang.InterruptedException
meth public int hashCode()
meth public java.lang.String toString()

CLSS public abstract interface org.netbeans.modules.php.api.editor.EditorSupport
meth public abstract java.util.Collection<org.netbeans.modules.php.api.editor.PhpClass> getClasses(org.openide.filesystems.FileObject)
meth public abstract java.util.Collection<org.netbeans.modules.php.api.editor.PhpType> getTypes(org.openide.filesystems.FileObject)
meth public abstract java.util.Collection<org.openide.util.Pair<org.openide.filesystems.FileObject,java.lang.Integer>> filesForClass(org.openide.filesystems.FileObject,org.netbeans.modules.php.api.editor.PhpClass)
meth public abstract org.netbeans.modules.php.api.editor.PhpBaseElement getElement(org.openide.filesystems.FileObject,int)

CLSS public abstract org.netbeans.modules.php.api.editor.PhpBaseElement
cons protected init(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons protected init(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons protected init(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
cons protected init(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
cons protected init(java.lang.String,java.lang.String,org.netbeans.modules.php.api.editor.PhpType,org.openide.filesystems.FileObject,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
 anno 6 org.netbeans.api.annotations.common.NullAllowed()
cons protected init(java.lang.String,java.lang.String,org.openide.filesystems.FileObject)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
cons protected init(java.lang.String,java.lang.String,org.openide.filesystems.FileObject,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
 anno 5 org.netbeans.api.annotations.common.NullAllowed()
cons protected init(java.lang.String,org.netbeans.modules.php.api.editor.PhpType)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public int getOffset()
meth public java.lang.String getDescription()
 anno 0 org.netbeans.api.annotations.common.CheckForNull()
meth public java.lang.String getFullyQualifiedName()
 anno 0 org.netbeans.api.annotations.common.CheckForNull()
meth public java.lang.String getName()
meth public org.netbeans.modules.php.api.editor.PhpType getType()
 anno 0 org.netbeans.api.annotations.common.CheckForNull()
meth public org.openide.filesystems.FileObject getFile()
 anno 0 org.netbeans.api.annotations.common.CheckForNull()
meth public void setFile(org.openide.filesystems.FileObject)
supr java.lang.Object
hfds description,file,fullyQualifiedName,name,offset,type

CLSS public final org.netbeans.modules.php.api.editor.PhpClass
cons public init(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpClass addField(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpClass addField(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpClass addField(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpClass addField(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpClass addField(java.lang.String,org.netbeans.modules.php.api.editor.PhpType,org.openide.filesystems.FileObject,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpClass addMethod(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpClass addMethod(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpClass addMethod(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpClass addMethod(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
supr org.netbeans.modules.php.api.editor.PhpType

CLSS public org.netbeans.modules.php.api.editor.PhpEnum
cons public init(java.lang.String,java.lang.String)
cons public init(java.lang.String,java.lang.String,int)
cons public init(java.lang.String,java.lang.String,int,java.lang.String)
cons public init(java.lang.String,java.lang.String,java.lang.String)
meth public org.netbeans.modules.php.api.editor.PhpEnum addField(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpEnum addField(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpEnum addField(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpEnum addField(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpEnum addField(java.lang.String,org.netbeans.modules.php.api.editor.PhpType,org.openide.filesystems.FileObject,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpEnum addMethod(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpEnum addMethod(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpEnum addMethod(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpEnum addMethod(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
supr org.netbeans.modules.php.api.editor.PhpType

CLSS public final org.netbeans.modules.php.api.editor.PhpFunction
cons public init(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
supr org.netbeans.modules.php.api.editor.PhpBaseElement

CLSS public final org.netbeans.modules.php.api.editor.PhpInterface
cons public init(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpInterface addMethod(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpInterface addMethod(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpInterface addMethod(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpInterface addMethod(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
supr org.netbeans.modules.php.api.editor.PhpType

CLSS public final org.netbeans.modules.php.api.editor.PhpTrait
cons public init(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpTrait addField(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpTrait addField(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpTrait addField(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpTrait addField(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpTrait addField(java.lang.String,org.netbeans.modules.php.api.editor.PhpType,org.openide.filesystems.FileObject,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpTrait addMethod(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpTrait addMethod(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpTrait addMethod(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
meth public org.netbeans.modules.php.api.editor.PhpTrait addMethod(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
supr org.netbeans.modules.php.api.editor.PhpType

CLSS public abstract org.netbeans.modules.php.api.editor.PhpType
cons protected init(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons protected init(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons protected init(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
cons protected init(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
innr public final Field
innr public final Method
meth protected org.netbeans.modules.php.api.editor.PhpType addField(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth protected org.netbeans.modules.php.api.editor.PhpType addField(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth protected org.netbeans.modules.php.api.editor.PhpType addField(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
meth protected org.netbeans.modules.php.api.editor.PhpType addField(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
meth protected org.netbeans.modules.php.api.editor.PhpType addField(java.lang.String,org.netbeans.modules.php.api.editor.PhpType,org.openide.filesystems.FileObject,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
meth protected org.netbeans.modules.php.api.editor.PhpType addMethod(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth protected org.netbeans.modules.php.api.editor.PhpType addMethod(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
meth protected org.netbeans.modules.php.api.editor.PhpType addMethod(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
meth protected org.netbeans.modules.php.api.editor.PhpType addMethod(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
meth public java.util.Collection<org.netbeans.modules.php.api.editor.PhpType$Field> getFields()
meth public java.util.Collection<org.netbeans.modules.php.api.editor.PhpType$Method> getMethods()
supr org.netbeans.modules.php.api.editor.PhpBaseElement
hfds fields,methods

CLSS public final org.netbeans.modules.php.api.editor.PhpType$Field
 outer org.netbeans.modules.php.api.editor.PhpType
meth public org.netbeans.modules.php.api.editor.PhpType getPhpType()
supr org.netbeans.modules.php.api.editor.PhpBaseElement

CLSS public final org.netbeans.modules.php.api.editor.PhpType$Method
 outer org.netbeans.modules.php.api.editor.PhpType
meth public org.netbeans.modules.php.api.editor.PhpType getPhpType()
supr org.netbeans.modules.php.api.editor.PhpBaseElement

CLSS public final org.netbeans.modules.php.api.editor.PhpVariable
cons public init(java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,int,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 4 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,java.lang.String)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,org.openide.filesystems.FileObject)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,java.lang.String,org.openide.filesystems.FileObject,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,org.netbeans.modules.php.api.editor.PhpClass)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
cons public init(java.lang.String,org.netbeans.modules.php.api.editor.PhpClass,org.openide.filesystems.FileObject,int)
 anno 1 org.netbeans.api.annotations.common.NonNull()
 anno 2 org.netbeans.api.annotations.common.NullAllowed()
 anno 3 org.netbeans.api.annotations.common.NullAllowed()
supr org.netbeans.modules.php.api.editor.PhpBaseElement

CLSS public abstract org.netbeans.modules.php.spi.editor.EditorExtender
cons public init()
meth public abstract java.util.List<org.netbeans.modules.php.api.editor.PhpBaseElement> getElementsForCodeCompletion(org.openide.filesystems.FileObject)
supr java.lang.Object

