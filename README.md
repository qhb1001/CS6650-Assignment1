# Github Repo Link

https://github.com/qhb1001/CS6650-Assignment1

# Estimation & Output

All of the Estimations are based on the throughput of a single thread: 11.4 (tested locally by running 10000 requests in a single thread)

| Wall Time              | 32 Threads | 64 Threads | 128 Threads | 256 Threads |
| ---------------------- | ---------- | ---------- | ----------- | ----------- |
| Lower Bound Estimation | 493.4      | 246.7      | 123.3       | 61.6        |
| Output - Client Part 1 | 1052.8     | 528.2      | 267.3       | 137.5       |
| Output - Client Part 2 | 1061.6     | 535.5      | 267.8       | 137.9       |
| Upper Bound Estimation | 19736.8    | 986.8      | 493.2       | 246.4       |

### 32-threads system estimation 

*   Phase 1
    threadsNum: 8, requestPerThread: 5000, number of requests in phase: 40000
*   Phase 2 
    threadsNum: 32, requestPerThread: 3750, number of requests in phase: 120000
*   Phase 3
    threadsNum: 8, requestPerThread: 2500, number of requests in phase: 20000

Number of requests in three phases = 40000 + 120000 + 20000 = 180000

Wall time, upper bound estimation (assume that this is a 8-threads system): 180000 / (8 * 11.4) = 19736.8

Wall time, lower bound estimation (assume that this is a 32-threads system): 180000 / (32 * 11.4) = 493.4

### 64-threads system estimation 

*   Phase 1
    threadsNum: 16, requestPerThread: 2500, number of requests in phase: 40000
*   Phase 2 
    threadsNum: 64, requestPerThread: 1875, number of requests in phase: 120000
*   Phase 3
    threadsNum: 16, requestPerThread: 1250, number of requests in phase: 20000

Number of requests in three phases = 40000 + 120000 + 20000 = 180000

Wall time, upper bound estimation (assume that this is a 16-threads system): 180000 / (16 * 11.4) = 986.8

Wall time, lower bound estimation (assume that this is a 64-threads system): 180000 / (64 * 11.4) = 246.7

### 128-threads system estimation 

*   Phase 1
    threadsNum: 32, requestPerThread: 1250, number of requests in phase: 40000
*   Phase 2 
    threadsNum: 128, requestPerThread: 937, number of requests in phase: 119936
*   Phase 3
    threadsNum: 32, requestPerThread: 625, number of requests in phase: 20000

Number of requests in three phases = 40000 + 119936 + 20000 = 179936

Wall time, upper bound estimation (assume that this is a 32-threads system): 179936 / (32 * 11.4) = 493.2

Wall time, lower bound estimation (assume that this is a 128-threads system): 179936 / (128 * 11.4) = 123.3

### 256-threads system estimation 

*   Phase 1
    threadsNum: 64, requestPerThread: 625, number of requests in phase: 40000
*   Phase 2 
    threadsNum: 256, requestPerThread: 468, number of requests in phase: 119808
*   Phase 3
    threadsNum: 64, requestPerThread: 312, number of requests in phase: 19968

Number of requests in three phases = 40000 + 119808 + 19968 = 179776

Wall time, upper bound estimation (assume that this is a 64-threads system): 179776 / (64 * 11.4) = 246.4

Wall time, lower bound estimation (assume that this is a 256-threads system): 179776 / (256 * 11.4) = 61.6

