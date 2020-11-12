package intellij.plugin;

import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.Nullable;

public class Notify
{
    private static final NotificationGroup NOTIFICATION_GROUP = new NotificationGroup(
        "Yiyan NotificationGroup", NotificationDisplayType.BALLOON, true
    );

    public static void info(@Nullable Project project, String content)
    {
        NOTIFICATION_GROUP.createNotification("一言", content, NotificationType.INFORMATION, null)
                          .notify(project);
    }

}
