package com.github.lookout.whoas


/**
 * Interface defining how 'HookQueue' providers should behave
 *
 * This allows for different queueing implementations behind whoas
 */
abstract class AbstractHookQueue {
    /**
     * Return the size of the queue, may not be implemented by some providers
     * in which case it will return -1
     */
    abstract Long getSize()


    /**
     *
     */
    abstract void pop(Closure action)

    /**
     *
     */
    abstract Boolean push(HookRequest request)
}
