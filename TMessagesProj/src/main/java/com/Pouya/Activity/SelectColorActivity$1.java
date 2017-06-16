.class Lorg/pouyadr/Pouya/Activity/SelectColorActivity$1;
.super Ljava/lang/Object;
.source "SelectColorActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/pouyadr/Pouya/Activity/SelectColorActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/pouyadr/Pouya/Activity/SelectColorActivity;


# direct methods
.method constructor <init>(Lorg/pouyadr/Pouya/Activity/SelectColorActivity;)V
    .registers 2
    .param p1, "this$0"    # Lorg/pouyadr/Pouya/Activity/SelectColorActivity;

    .prologue
    .line 23
    iput-object p1, p0, Lorg/pouyadr/Pouya/Activity/SelectColorActivity$1;->this$0:Lorg/pouyadr/Pouya/Activity/SelectColorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .registers 7
    .param p2, "view"    # Landroid/view/View;
    .param p3, "i"    # I
    .param p4, "l"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 26
    .local p1, "adapterView":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    invoke-static {}, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->LoadThemes()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/pouyadr/Pouya/Models/Theme;

    invoke-static {v0}, Lorg/pouyadr/Pouya/Helper/ThemeChanger;->ChangeTheme(Lorg/pouyadr/Pouya/Models/Theme;)V

    .line 27
    iget-object v0, p0, Lorg/pouyadr/Pouya/Activity/SelectColorActivity$1;->this$0:Lorg/pouyadr/Pouya/Activity/SelectColorActivity;

    invoke-virtual {v0}, Lorg/pouyadr/Pouya/Activity/SelectColorActivity;->finish()V

    .line 28
    return-void
.end method
