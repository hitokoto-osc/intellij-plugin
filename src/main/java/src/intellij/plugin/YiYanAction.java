package src.intellij.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class YiYanAction extends AnAction
{
    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent)
    {
        var project = getEventProject(anActionEvent);
        var yiyan   = new YiYan().getOnce();

        Notify.info(project, yiyan);
    }
}
