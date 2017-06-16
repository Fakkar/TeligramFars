.class public Lorg/pouyadr/Pouya/Helper/NotiFicationMaker;
.super Ljava/lang/Object;
.source "NotiFicationMaker.java"


# static fields
.field private static final NOTIFICATION_ID:I = 0x5340


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static cancelNotification()V
    .registers 3

    .prologue
    .line 53
    sget-object v1, Lorg/pouyadr/messenger/ApplicationLoader;->applicationContext:Landroid/content/Context;

    sget-object v2, Lorg/pouyadr/messenger/ApplicationLoader;->applicationContext:Landroid/content/Context;

    const-string v2, "notification"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 55
    .local v0, "notificationManager":Landroid/app/NotificationManager;
    const/16 v1, 0x5340

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 56
    return-void
.end method

.method public static createNotification()V
    .registers 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    const/4 v8, 0x0

    .line 25
    sget-object v5, Lorg/pouyadr/messenger/ApplicationLoader;->applicationContext:Landroid/content/Context;

    sget-object v6, Lorg/pouyadr/messenger/ApplicationLoader;->applicationContext:Landroid/content/Context;

    const-string v6, "notification"

    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/NotificationManager;

    .line 27
    .local v2, "notificationManager":Landroid/app/NotificationManager;
    new-instance v5, Landroid/support/v4/app/NotificationCompat$Builder;

    sget-object v6, Lorg/pouyadr/messenger/ApplicationLoader;->applicationContext:Landroid/content/Context;

    invoke-direct {v5, v6}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    const-string v6, "GhostModeIsActive"

    const v7, 0x7f080433

    .line 28
    invoke-static {v6, v7}, Lorg/pouyadr/messenger/LocaleController;->getString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v5

    const-string v6, "GhostModeInfo"

    const v7, 0x7f080432

    .line 29
    invoke-static {v6, v7}, Lorg/pouyadr/messenger/LocaleController;->getString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v5

    const v6, 0x7f020132

    .line 30
    invoke-virtual {v5, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v5

    const/4 v6, 0x1

    .line 31
    invoke-virtual {v5, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setOngoing(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v5

    .line 32
    invoke-virtual {v5, v8}, Landroid/support/v4/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    .line 34
    .local v0, "builder":Landroid/support/v4/app/NotificationCompat$Builder;
    new-instance v1, Landroid/content/Intent;

    sget-object v5, Lorg/pouyadr/messenger/ApplicationLoader;->applicationContext:Landroid/content/Context;

    const-class v6, Lorg/pouyadr/ui/LaunchActivity;

    invoke-direct {v1, v5, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 35
    .local v1, "intent":Landroid/content/Intent;
    const-string v5, "android.intent.action.MAIN"

    invoke-virtual {v1, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    const-string v5, "android.intent.category.LAUNCHER"

    invoke-virtual {v1, v5}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    sget-object v5, Lorg/pouyadr/messenger/ApplicationLoader;->applicationContext:Landroid/content/Context;

    invoke-static {v5}, Landroid/support/v4/app/TaskStackBuilder;->create(Landroid/content/Context;)Landroid/support/v4/app/TaskStackBuilder;

    move-result-object v4

    .line 39
    .local v4, "stackBuilder":Landroid/support/v4/app/TaskStackBuilder;
    const-class v5, Lorg/pouyadr/ui/LaunchActivity;

    invoke-virtual {v4, v5}, Landroid/support/v4/app/TaskStackBuilder;->addParentStack(Ljava/lang/Class;)Landroid/support/v4/app/TaskStackBuilder;

    .line 40
    invoke-virtual {v4, v1}, Landroid/support/v4/app/TaskStackBuilder;->addNextIntent(Landroid/content/Intent;)Landroid/support/v4/app/TaskStackBuilder;

    .line 42
    const/high16 v5, 0x8000000

    invoke-virtual {v4, v8, v5}, Landroid/support/v4/app/TaskStackBuilder;->getPendingIntent(II)Landroid/app/PendingIntent;

    move-result-object v3

    .line 44
    .local v3, "pendingIntent":Landroid/app/PendingIntent;
    invoke-virtual {v0, v3}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 46
    const/16 v5, 0x5340

    invoke-virtual {v0}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 47
    return-void
.end method
