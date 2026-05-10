package ai.koog.agents.core.environment

import ai.koog.serialization.JSONObject
import kotlin.coroutines.CoroutineContext

/**
 * Context for tool calls, providing necessary information for coroutine context management.
 * This context element carries details about the tool call to be used in coroutine operations.
 *
 * @property agentId Identifier for the agent associated with the tool call.
 * @property toolCallId Optional identifier for the specific tool call (used in multiple calls).
 * @property toolName Name of the tool being called.
 * @property toolArgs Arguments to be passed to the tool.
 */
public data class ToolCallContext(
    val agentId: String,
    val toolCallId: String?,
    val toolName: String,
    val toolArgs: JSONObject,
): CoroutineContext.Element {
    override val key: CoroutineContext.Key<ToolCallContext> get() = Key

    /**
     * Companion object that serves as the key for the [ToolCallContext] in the coroutine context.
     * This key is used to identify and retrieve the [ToolCallContext] element from a coroutine context.
     */
    public companion object Key : CoroutineContext.Key<ToolCallContext>
}
